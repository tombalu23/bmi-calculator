package com.example.tombalu.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        double f=getIntent().getExtras().getFloat("weight");
        double h=getIntent().getExtras().getFloat("heigh")/100;
        String bmi=null;
        TextView t=findViewById(R.id.textView4);
        DecimalFormat dec = new DecimalFormat("#0.0");
        double r=(f)/(h*h) ;
        double bm= Double.parseDouble((dec.format(r)));
        t.setText("Your BMI : " + String.valueOf(dec.format(r)));

        if(bm<18.5)
        {
            bmi="Underweight";


        }

        else if(bm<=24.9)
        {
            bmi="Normal weight";
        }

        else if(bm<30)
        {
            bmi="Overweight";
        }

        else if(bm>=30)
        {
            bmi="Obese";
        }


        TextView a=findViewById(R.id.category);
        a.setText("You are " + bmi);


    }


}
