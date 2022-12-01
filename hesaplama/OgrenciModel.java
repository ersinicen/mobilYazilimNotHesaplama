package com.example.hesaplama;

public class OgrenciModel {
    String adi;
    String soyadi;
    int yasi;

    public OgrenciModel(String adi, String soyadi, int yasi) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.yasi = yasi;
    }

    public String getAdi() {
        return adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public int getYasi() {
        return yasi;
    }

}
