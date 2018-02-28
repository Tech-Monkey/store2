package com.example.sowmya.firebase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class StoreRegisterActivity extends AppCompatActivity {
    EditText email,password,name_of_store;
    Button signup;
    DatabaseReference mDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_register);
        email=(EditText)findViewById(R.id.editText2);
        password=(EditText)findViewById(R.id.editText3);
        name_of_store=(EditText)findViewById(R.id.editText4);
        signup=(Button)findViewById(R.id.button3);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Code for authentication and storing in firebase
                mDatabase= FirebaseDatabase.getInstance().getReference();


                mDatabase.child("Name").setValue("Rathish");
                Toast.makeText(StoreRegisterActivity.this,"Name",Toast.LENGTH_LONG).show();

                Intent intent=new Intent(StoreRegisterActivity.this,UpdateMedicinesActivity.class);
                startActivity(intent);



                    }
        });


    }
}
