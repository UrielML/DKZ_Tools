package net.bitgeekenviroment.dkz_tools;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Caesar_Cipher extends AppCompatActivity {
    EditText keytxt, encode, decode;
    private String values = "abcdefghijklmnopqrstuvwxyz0123456789";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caesar__cipher);
    }


    public void encode(){
        try {
            Integer.parseInt(keytxt.getText().toString());
            encode.setText(Encode(decode.getText().toString(), Integer.parseInt(keytxt.getText().toString())));
        } catch(NumberFormatException e1) {
            //JOptionPane.showMessageDialog(this, "Enter digits only");
        }
    }

    public void decode(){
        try {
            Integer.parseInt(keytxt.getText().toString());
            encode.setText(Decode(decode.getText().toString(), Integer.parseInt(keytxt.getText().toString())));
        } catch(NumberFormatException e1) {
            //JOptionPane.showMessageDialog(this, "Enter digits only");
        }
    }

    private String Encode(String text, int key) {
        char charEnc;
        int valEnc;
        int newEnc;
        String encrypted = "";
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            charEnc = text.charAt(i);
            valEnc = values.indexOf(charEnc);
            newEnc = (key + valEnc) % values.length();
            encrypted += values.charAt(newEnc);
        }
        return encrypted.toUpperCase();
    }

    private String Decode(String text, int key) {
        char charEnc;
        int valEnc;
        int newEnc;
        String decoded = "";
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            charEnc = text.charAt(i);
            valEnc = values.indexOf(charEnc);
            newEnc = (valEnc - key) % values.length();
            // check for negative
            if (newEnc < 0) {
                newEnc += Math.abs(values.length());
            }
            decoded += values.charAt(newEnc);
        }
        return decoded.toUpperCase();
    }
}