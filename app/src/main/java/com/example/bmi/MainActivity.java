package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView txtResult;
        EditText edtWeight ,edtHeight,edtHeightin;
        Button btnCalculate;



        edtWeight=findViewById(R.id.edtWeight);
        edtHeight=findViewById(R.id.edtHeight);
        edtHeightin=findViewById(R.id.edtHeightin);
        txtResult=findViewById(R.id.txtResult);
        btnCalculate=findViewById(R.id.btnCalculate);


        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
             int wt=  Integer.parseInt( edtWeight.getText().toString());
             int ft =Integer.parseInt(edtHeight.getText().toString());
            int in=Integer.parseInt( edtHeightin.getText().toString());

         int totalHt= ft*12+in;
         double totalCm=totalHt*2.53;
         double totalM=totalCm/100;
         double BMI=wt/(totalM*totalM);

         if(BMI>25)
         {
             txtResult.setText("Your are over Weight");

         } else if (BMI<18)
         {
             txtResult.setText("Your are Under Weight");

         }
         else txtResult.setText("Your are Healthy");

            }
        });


    }
}