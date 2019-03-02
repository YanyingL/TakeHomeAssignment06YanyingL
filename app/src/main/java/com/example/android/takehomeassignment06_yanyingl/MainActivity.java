package com.example.android.takehomeassignment06_yanyingl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public EditText amount_text;
    public EditText tax_text;
    public EditText tip_text;
    public Button submit_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amount_text=(EditText)findViewById(R.id.amount_field);
        tax_text=(EditText)findViewById(R.id.tax_field);
        tip_text=(EditText)findViewById(R.id.tip_field);
        submit_button=(Button)findViewById(R.id.submit_activity);

        submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit_activity();
            }
        });

    }

    public void submit_activity(){
        Intent intent=new Intent(MainActivity.this,Main2Activity.class);
        int amount =Integer.parseInt(amount_text.getText().toString());
        float tax = Float.valueOf(tax_text.getText().toString());
        float tip = Float.valueOf(tip_text.getText().toString());
        intent.putExtra("amount",amount);
        intent.putExtra("tax",tax);
        intent.putExtra("tip",tip);
        startActivity(intent);
    }
}
