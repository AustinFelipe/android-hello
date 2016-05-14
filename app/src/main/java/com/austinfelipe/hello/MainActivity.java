package com.austinfelipe.hello;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonToast = (Button)findViewById(R.id.button);
        buttonToast.setOnClickListener(this);

        Button buttonTela2 = (Button)findViewById(R.id.button2);
        buttonTela2.setOnClickListener(this);

        Log.d("NGVL", "Main::onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("NGVL", "Main::onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("NGVL", "Main::onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("NGVL", "Main::onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("NGVL", "Main::onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("NGVL", "Main::onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("NGVL", "Main::onDestroy");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                EditText text = (EditText)findViewById(R.id.editText);
                Toast.makeText(this, text.getText().toString(), Toast.LENGTH_SHORT).show();
                break;

            case R.id.button2:
                Intent intent = new Intent(this, Tela2Activity.class);
                intent.putExtra("cliente", new Cliente(1, "Austin Felipe"));
                startActivity(intent);
                break;
        }
    }
}
