package com.siscompal.clarorecarga.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.siscompal.clarorecarga.PaqueteListFragment;
import com.siscompal.clarorecarga.PaquetesDialogFragment;
import com.siscompal.clarorecarga.R;
import com.siscompal.clarorecarga.retrofit.response.Paquete;

public class RealizaPaquete extends AppCompatActivity {
    Button btnSelPaq;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realiza_paquete);
        btnSelPaq=findViewById(R.id.buttonselPaq);
        btnSelPaq.setOnClickListener(view -> {
            PaquetesDialogFragment paquetesDialogFragment = new PaquetesDialogFragment();
            paquetesDialogFragment.show(getSupportFragmentManager(), "Seleccione Paquete");
        });
    }
}
