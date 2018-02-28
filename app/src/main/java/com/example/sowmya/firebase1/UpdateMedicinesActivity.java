package com.example.sowmya.firebase1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UpdateMedicinesActivity extends AppCompatActivity {
    EditText medname,quantity;
    Button plus,minus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_medicines);
        medname=(EditText)findViewById(R.id.editText);
        quantity=(EditText)findViewById(R.id.editText6);
        plus=(Button)findViewById(R.id.button2);
        minus=(Button)findViewById(R.id.button4);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Quantity=Integer.valueOf(quantity.getText().toString());
                Quantity+=1;
                quantity.setText(""+Quantity);
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Quantity=Integer.valueOf(quantity.getText().toString());
                Quantity-=1;
                quantity.setText(""+Quantity);
            }
        });





    }
}
