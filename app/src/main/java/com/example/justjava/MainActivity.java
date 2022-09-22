package com.example.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void submitOrder(View view) {
        display(1);
    }

    public void display(int number) {
        TextView quantityTextView= (TextView) findViewById(R.id.quantity_text_view);
        quantity.TextView.setText("" + number);
    }


}
