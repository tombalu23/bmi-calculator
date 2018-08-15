
package com.example.tombalu.bmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.String.valueOf;

public class Calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
       // Bundle b=getIntent().getExtras();
        String s=getIntent().getExtras().getString("name");

        TextView t= findViewById(R.id.textView3);
        t.setText("Hey " + s + ",");
        float result;
       // EditText h= findViewById(R.id.editText7);
       // EditText w= findViewById(R.id.editText6);



        Button b = findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText h= findViewById(R.id.editText7);
                EditText w = findViewById(R.id.editText6);

                if (h.getText().toString().equals("") ) {
                    Toast.makeText(Calculator.this, "Invalid Height", Toast.LENGTH_SHORT).show();
                }

                else if (w.getText().toString().equals("") ) {
                    Toast.makeText(Calculator.this, "Invalid Weight", Toast.LENGTH_SHORT).show();
                    }




                    else if (h.getText().toString().equals("-") ) {
                        Toast.makeText(Calculator.this, "Invalid Height", Toast.LENGTH_SHORT).show();
                    }


                    else if (w.getText().toString().equals("-") ) {
                    Toast.makeText(Calculator.this, "Invalid Weight", Toast.LENGTH_SHORT).show();
                }

                else if(Float.parseFloat(String.valueOf(h.getText()))<=0)
                {
                    Toast.makeText(Calculator.this, "Invalid Height", Toast.LENGTH_SHORT).show();
                }
                else if(Float.parseFloat(String.valueOf(w.getText()))<=0)
                {
                    Toast.makeText(Calculator.this, "Invalid Weight", Toast.LENGTH_SHORT).show();
                }






                 else {
                    float result = Float.parseFloat(String.valueOf(w.getText()));
                    Intent i = new android.content.Intent(Calculator.this, result.class);
                    i.putExtra("weight", result);
                    i.putExtra("heigh",Float.parseFloat(String.valueOf(h.getText())));
                    startActivity(i);
                }
            }
        });

        }

    }

