package com.example.hesaplama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ekranGecis extends AppCompatActivity {

    TextView txtSonucc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekran_gecis);

        txtSonucc.findViewById(R.id.txtSonucc);
        String gelenDeger = getIntent().getExtras().getString("NOT_ORTALAMA");
        txtSonucc.setText(gelenDeger);
    }
}