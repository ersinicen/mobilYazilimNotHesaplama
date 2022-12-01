package com.example.hesaplama;

import android.widget.EditText;

public class Util {
    public static String getFromEditText(EditText editText){

        return editText.getText().toString();
    }

    public static float convertFloat(String string){

        return Float.parseFloat(string);
    }
}
