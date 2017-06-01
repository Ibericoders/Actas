package android.actas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btNuevo;
    Button btMostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nuevo(View v){
        Intent intent =new Intent(this, ActaNueva.class);
        this.startActivity(intent);
    };

    public void listado(View v){
        //mostramos la actividad del listado
        Intent intent =new Intent(this,ListadoActivity.class);
        this.startActivity(intent);
    }

}
