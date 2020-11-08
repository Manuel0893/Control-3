package com.example.descuarentenados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.Serializable;

public class ActivityRegistro extends AppCompatActivity {

    EditText nombre, apellido, genero, Nusuario, Ncontra;
    ListaUsuarios listaU;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        nombre = (EditText) findViewById(R.id.txtNombre);
        apellido = (EditText) findViewById(R.id.txtApellido);
        genero = (EditText) findViewById(R.id.txtGenero);
        Nusuario = (EditText) findViewById(R.id.txtUser);
        Ncontra = (EditText) findViewById(R.id.txtPasswd);

        listaU = new ListaUsuarios();

    }
    public void guardaUsuario(View vi){

        Usuario li = new Usuario(nombre.getText().toString(), apellido.getText().toString(), genero.getText().toString(),Nusuario.getText().toString(),Ncontra.getText().toString());
        listaU.userList.add(li);
        nombre.setText("");
        apellido.setText("");
        genero.setText("");
        Nusuario.setText("");
        Ncontra.setText("");


        for (Usuario u : listaU.userList){
            Toast.makeText(getApplicationContext(),"Usuario: "+u.getUser()+" Contraseña: "+u.getPassword()+" REGISTRO EXITOSO!",Toast.LENGTH_SHORT).show();
        }
    }

}