package modelo;

import android.content.Context;
import android.view.View;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;

import Javabean.Actas;

/**
 * Created by Itheron on 01/06/2017.
 */

public class GestionDatos {
   //definimos que tipo de archivo creamos
    String ruta="Actas.txt";
    Context ctx;

//-------------------------------Creamos el Context-------------------------------------------------
    public GestionDatos(Context ctx){
        this.ctx=ctx;
    }

//--------------------------------------------------------------------------------------------------

//-------------------------------Guardar Actas------------------------------------------------------
    public void GuardarActas(Actas ac){
        try {
            //leemos la ruta para guardarlo
            FileOutputStream fos = ctx.openFileOutput(ruta, Context.MODE_APPEND);
            PrintStream salida = new PrintStream(fos);
            //obtenemos los datos de la ruta y separamos
            //salida.println(ac.() + "|" + ac.getFecha() + "|" + ac.());
            salida.close();
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
    }

//--------------------------------------------------------------------------------------------------

//------------------------------Recuperar las Actas-------------------------------------------------
    public ArrayList<Actas> recuperarActas(){
        //creamos objeto del arrayList
        ArrayList<Actas> actas=new ArrayList<>();
        String s;
        try {
            //Pedimos lo que hay en la ruta
            FileInputStream fis = ctx.openFileInput(ruta);
            //se lee lo obtenido
            BufferedReader bf = new BufferedReader(new InputStreamReader(fis));
            //lee todo lo que tenga mientras sea distinto de null
            while ((s = bf.readLine()) != null) {
                //separamos lo obtenido mediante |
                String[] datos = s.split("[|]");
               // Actas ac = new Actas(datos[0], datos[1], Boolean.parseBoolean(datos[2]));
                //actas.add(ac);
            }
            bf.close();
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
        return actas;
    }
//--------------------------------------------------------------------------------------------------

}
