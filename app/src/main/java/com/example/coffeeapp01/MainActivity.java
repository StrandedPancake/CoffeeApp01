package com.example.coffeeapp01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    //declare variables
    int noOfCoffee = 0;
    int priceOfCoffee = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //method that wil be called when the Order button is clicked
    public void submitOrder(View view){
        //call another method called display()
        //display(6);
        String output = "";
        int totalPrice = noOfCoffee * priceOfCoffee;
        output = "Total: $"+totalPrice+"\n"+"Order has been placed"+"\n"+"Thank you!";
        TextView price = findViewById(R.id.price_text_view);
        price.setText(output);
    }

    private void display(int number) {
        //display this number in the quantity_text_view
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText(""+number);
    }
    //method to increase coffees when + button is clicked
    public void increment(View view){
        noOfCoffee = noOfCoffee+1;
        if (noOfCoffee>10){
            noOfCoffee = 10;
        }
        display(noOfCoffee);
    }
    //method to increase coffees when - button is clicked
    public void decrement(View view){
        noOfCoffee = noOfCoffee-1;
        if (noOfCoffee<1){
            noOfCoffee = 0;
        }
        display(noOfCoffee);
    }
}