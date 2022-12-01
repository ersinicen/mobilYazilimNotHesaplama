package com.example.hesaplama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetayActivity extends AppCompatActivity {
    TextView txtAdi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detay);
        txtAdi = findViewById(R.id.txtAdi);

        OgrenciModel tasinanModel = (OgrenciModel).getIntent().getParcelableExtra(Constants.TAŞINAN_DATA_İSİM);
        txtAdi.setText(" "+tasinanModel.adi);
    }
}