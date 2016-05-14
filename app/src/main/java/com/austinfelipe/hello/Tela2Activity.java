package com.austinfelipe.hello;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Tela2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        TextView text = (TextView)findViewById(R.id.textView);
        Intent intent = getIntent();
        Cliente cliente = intent.getParcelableExtra("cliente");

        text.setText(String.format("Nome: %s / Código: %d", cliente.nome, cliente.codigo));

        Log.d("NGVL", "Tela2::onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("NGVL", "Tela2::onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("NGVL", "Tela2::onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("NGVL", "Tela2::onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("NGVL", "Tela2::onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("NGVL", "Tela2::onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("NGVL", "Tela2::onDestroy");
    }
}
