package android.actas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import Javabean.Actas;
import modelo.GestionDatos;

/**
 * Created by Itheron on 01/06/2017.
 */

class ListadoActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_actas);
        GestionDatos gdatos=new GestionDatos(this);
        ListView lista=(ListView)this.findViewById(R.id.lvActas);
        //creamos adaptador a partir del arraylist
        ArrayAdapter<Actas> adapter=new ArrayAdapter<Actas>(this,
                android.R.layout.simple_list_item_1,
                gdatos.recuperarActas());
        lista.setAdapter(adapter);
    }
}
