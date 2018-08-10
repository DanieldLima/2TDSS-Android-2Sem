package br.com.fiap.splashscreenpersistence;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.SeekBar;
import android.widget.Toast;

public class ConfigActivity extends AppCompatActivity {

    CheckBox chkIsSplash;
    SeekBar skbTempo;

    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);

        chkIsSplash = findViewById(R.id.chkIsSplash);
        skbTempo = findViewById(R.id.skbTempo);

        sp = getSharedPreferences("config", MODE_PRIVATE);

        boolean checado = sp.getBoolean("checado", true);
        chkIsSplash.setChecked(checado);

        int tempo = sp.getInt("tempo", 1000);
        skbTempo.setProgress(tempo);
    }

    public void salvar(View view) {
        SharedPreferences.Editor editor = sp.edit();

        boolean check = chkIsSplash.isChecked();
        int tempo = skbTempo.getProgress();

        editor.putBoolean("checado", check);
        editor.putInt("tempo", tempo);
        editor.commit();

        Toast.makeText(this, "salvo", Toast.LENGTH_SHORT).show();
        finish();


    }
}
