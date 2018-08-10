package br.com.fiap.splashscreenpersistence;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BtnConfigActivity extends AppCompatActivity {

    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btnconfig);
    }

    public void config(View view) {
        Intent it = new Intent(this, ConfigActivity.class);
        startActivity(it);
    }
}
