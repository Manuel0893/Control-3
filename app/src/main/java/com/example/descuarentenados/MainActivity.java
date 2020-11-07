package com.example.descuarentenados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText usuario, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         usuario = (EditText) findViewById(R.id.txtUsuario);
         password =  (EditText) findViewById(R.id.txtContraseña);
    }

    public void Login(View view){
        Intent intento = new Intent(getApplicationContext(), ActivityFormulario.class);

        intento.putExtra("usuario",usuario.getText().toString());
        intento.putExtra("contraseña",password.getText().toString());
        startActivity(intento);
    }
    public void registrAct(View view){
        Intent inte = new Intent(getApplicationContext(), ActivityRegistro.class);
        startActivity(inte);
    }

}