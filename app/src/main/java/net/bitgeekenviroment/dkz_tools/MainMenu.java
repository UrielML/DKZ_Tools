package net.bitgeekenviroment.dkz_tools;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity implements View.OnClickListener {
    Button caesar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        caesar=findViewById(R.id.btn_CaesarCipher);
        caesar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==caesar){
            Intent i = new Intent(this, Caesar_Cipher.class);
            startActivity(i);
        }
    }
}
