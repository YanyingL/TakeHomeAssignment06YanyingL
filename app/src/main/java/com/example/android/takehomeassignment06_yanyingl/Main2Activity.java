package com.example.android.takehomeassignment06_yanyingl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    public TextView receipt_view;
    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("Your Receipt");
        receipt_view=(TextView)findViewById(R.id.receipt);

        Intent intent = getIntent();
        int amount = intent.getIntExtra("amount",0);
        float tax = intent.getFloatExtra("tax",0);
        float tip = intent.getFloatExtra("tip",0);
        float tax_final=amount*tax;
        float tip_final=amount*tip;
        float total=amount+tax_final+tip_final;

        result="Total: "+amount +"\nSales Tax: "+tax_final+"\nTips: "+tip_final+"\nGrand Total: "+total;
        receipt_view.setText(result);
    }


    }
