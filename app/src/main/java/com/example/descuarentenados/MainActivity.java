package com.example.descuarentenados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

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
        String usr = "";
        String pwd = "";
         usr = usuario.getText().toString();
         pwd = password.getText().toString();

            Intent intento = new Intent(getApplicationContext(), ActivityFormulario.class);

            startActivity(intento);


    }
    public void registrAct(View view){
        Intent inte = new Intent(getApplicationContext(), ActivityRegistro.class);
        startActivity(inte);
    }

}