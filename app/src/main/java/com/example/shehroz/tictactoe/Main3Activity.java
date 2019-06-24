package com.example.shehroz.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    Button btnSin;
    Button btnMul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
      /*  btnSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnSingle(v);
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnMull(v);
            }
        });*/
    }

    public void btnSingle(View view) {
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }

    public void btnMull(View view) {
        Intent i=new Intent(this,Main2Activity.class);
       startActivity(i);
    }
}
