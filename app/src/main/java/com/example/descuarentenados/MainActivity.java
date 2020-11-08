package com.example.descuarentenados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText usuario, password;
    Usuario Nusuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



         usuario = (EditText) findViewById(R.id.txtUsuario);
         password =  (EditText) findViewById(R.id.txtContraseña);
    }

    public void Login(View view){

        if (usuario.getText().equals(Nusuario.getUser()) && password.getText().equals(Nusuario.getPassword())) {
            Intent intento = new Intent(getApplicationContext(), ActivityFormulario.class);

            intento.putExtra("usuario", usuario.getText().toString());
            intento.putExtra("contraseña", password.getText().toString());
            startActivity(intento);
        }else{
            Toast.makeText(getApplicationContext(),"No existe el usuario ingresado",Toast.LENGTH_SHORT).show();
        }
    }
    public void registrAct(View view){
        Intent inte = new Intent(getApplicationContext(), ActivityRegistro.class);
        startActivity(inte);
    }

}