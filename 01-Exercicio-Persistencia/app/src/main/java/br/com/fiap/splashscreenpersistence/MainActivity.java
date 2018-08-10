package br.com.fiap.splashscreenpersistence;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Handler handler = new Handler();

    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = getSharedPreferences("config", MODE_PRIVATE);

        boolean exibir = sp.getBoolean("checado", true);
        int tempo = sp.getInt("tempo", 1000);

        if (exibir) {
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    abrirDashboard();
                }
            }, tempo);

        } else {
            abrirDashboard();
        }
    }

    public void abrirDashboard() {
        Intent it = new Intent(MainActivity.this, BtnConfigActivity.class);
        startActivity(it);
        finish();
    }
}
