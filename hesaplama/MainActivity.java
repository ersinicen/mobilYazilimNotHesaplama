package com.example.hesaplama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtVize, edtFinal;
    Button btnHesapla;
    TextView txtSonuc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        initUI();
        buttonClick();
    }

    private void initUI(){
        edtVize = findViewById(R.id.edtVize);
        edtFinal = findViewById(R.id.edtFinal);
        btnHesapla = findViewById(R.id.btnHesapla);
        txtSonuc = findViewById(R.id.txtSonuc);
    }

    private void hesapla(){
        float sonuc = Util.convertFloat(Util.getFromEditText(edtVize))*0.4f+ Util.convertFloat(Util.getFromEditText(edtFinal))*0.6f;
        setSonuc(sonuc);
    }

    private void buttonClick(){

        btnHesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hesapla();
                /*
                Intent ekran = new Intent(MainActivity.this,ekranGecis.class);
                ekran.putExtra("NOT_ORTALAMA",txtSonuc.getText().toString());
                startActivity(ekran);
                */

                OgrenciModel ogrenciModel = new OgrenciModel("Beyza","KOYULMUŞ",29);
                Intent intent = new Intent(MainActivity.this,DetayActivity.class);
                intent.putExtra(Constants.TAŞINAN_DATA_İSİM,ogrenciModel);
                startActivity(intent);

            }
        });
    }

    private void setSonuc(float deger){

        txtSonuc.setText(getResources().getString(R.string.sonuc)+deger);
    }
}