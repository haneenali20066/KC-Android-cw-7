package com.example.cw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Food> foodorder = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView food = (TextView)findViewById(R.id.textView);





        Food cheese = new Food("cheese" , 3 , R.drawable.cheese);
        Food chocolate = new Food("chocolate" , 4 , R.drawable.chocolate);
        Food coffee = new Food("coffee" , 2 , R.drawable.coffee);
        Food donut = new Food("donut" , 1, R.drawable.donut);
        Food fries = new Food("fries" , 2 , R.drawable.fries);
        Food honey = new Food("honey" , 24 , R.drawable.honey);

        foodorder.add(cheese);
        foodorder.add(chocolate);
        foodorder.add(coffee);
        foodorder.add(donut);
        foodorder.add(fries);
        foodorder.add(honey);

        ListView foodlist = (ListView) findViewById(R.id.list) ;


        FoodAdapter h = new FoodAdapter(this , 0 ,foodorder);

        foodlist.setAdapter(h);



    }
}