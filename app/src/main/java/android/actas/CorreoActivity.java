package android.actas;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CorreoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correo);
    }

//---------------------------Enviar correo----------------------------------------------------------
    public void onClick(View v) {
        // introducimos un array con el correo prefijado ya que solo es para ese
        String[] to = { "ibericoders@gmail.ccm" };
        String[] cc = { "" };
        enviar(to, cc, "Hola",
                "Esto es un email enviado desde app de Android");
    }
//--------------------------------------------------------------------------------------------------

//--------------------------Enviar texto en correo--------------------------------------------------
    private void enviar(String[] to, String[] cc,
                        String asunto, String mensaje) {
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setData(Uri.parse("mailto:"));
        //String[] to = direccionesEmail;
        //String[] cc = copias;
        emailIntent.putExtra(Intent.EXTRA_EMAIL, to);
        emailIntent.putExtra(Intent.EXTRA_CC, cc);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, asunto);
        emailIntent.putExtra(Intent.EXTRA_TEXT, mensaje);
        emailIntent.setType("message/rfc822");
        startActivity(Intent.createChooser(emailIntent, "Email "));
    }

}
