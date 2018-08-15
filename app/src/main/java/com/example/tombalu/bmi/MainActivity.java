package com.example.tombalu.bmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = findViewById(R.id.cont);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            EditText E= findViewById(R.id.editText);
            String sr=E.getText().toString();
                Intent i=new android.content.Intent(MainActivity.this, Calculator.class);
                i.putExtra("name",sr);
             startActivity(i);
            }
        });

    }

    void moveto(android.view.View view)
    {

    }
}
