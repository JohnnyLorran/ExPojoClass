package com.example.classePojoJava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.classePojoJava.Model.Cliente;

public class MainActivity extends AppCompatActivity {
    Cliente cliente;
    String TAG = "Log";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cliente = new Cliente("Johnny", "johnnylsrdarocha@gmail.com","(99)99999-9999",26,true);
        Log.i(TAG,"Nome " + cliente.getNome());
        Log.i(TAG,"Email " + cliente.getEmail());
        Log.i(TAG,"Telefone " + cliente.getTelefone());
        Log.i(TAG,"Idade " + cliente.getIdade());
        Log.i(TAG,"Sexo " + cliente.isSexo());
    }
}