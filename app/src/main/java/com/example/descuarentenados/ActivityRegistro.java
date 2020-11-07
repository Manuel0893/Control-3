package com.example.descuarentenados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ActivityRegistro extends AppCompatActivity {

    EditText nombre, apellido, genero, Nusuario, Ncontra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        nombre = (EditText) findViewById(R.id.txtNombre);
        apellido = (EditText) findViewById(R.id.txtApellido);
        genero = (EditText) findViewById(R.id.txtGenero);
        Nusuario = (EditText) findViewById(R.id.txtUser);
        Ncontra = (EditText) findViewById(R.id.txtPasswd);

    }

    public void loginActivity(View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}