package com.nere5.mascotasapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class FormularioContacto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_contacto);
    }

    public void enviarEmail(View view) {
        EditText edtNombreContacto = (EditText) findViewById(R.id.edtNombreContacto);
        EditText edtEmail = (EditText) findViewById(R.id.edtEmail);
        EditText edtMensaje = (EditText) findViewById(R.id.edtMensaje);

        String nombreContacto = edtNombreContacto.getText().toString();
        String email = edtEmail.getText().toString();
        String mensaje = edtMensaje.getText().toString();

        Intent emailIntent = new Intent((Intent.ACTION_SEND));
        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.putExtra(Intent.EXTRA_EMAIL, email);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, nombreContacto);
        emailIntent.putExtra(Intent.EXTRA_TEXT, mensaje);
        emailIntent.setType("message/rfc822");
        startActivity(Intent.createChooser(emailIntent, "Email "));
    }

}