package com.example.apptonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainFood extends AppCompatActivity {
    GridView gvFood;
    ListView lvFood;
    ArrayList<Gridview_Food> arrayGridFood;
    ArrayList<Food> arrayFood;
    FoodAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_food);

        AnhXa();
        adapter = new FoodAdapter(this,R.layout.dong_food,arrayFood);
        lvFood.setAdapter(adapter);



    }

    private void AnhXa() {
        lvFood = findViewById(R.id.listviewFood);
        arrayFood = new ArrayList<>();


        arrayFood.add(new Food("Hamburger","4.3",R.drawable.burger));
        arrayFood.add(new Food("Cheese","10.4",R.drawable.cheese));
        arrayFood.add(new Food("Pasta","6.3",R.drawable.pasta));
        arrayFood.add(new Food("Sushi","3.3",R.drawable.sushi));
        arrayFood.add(new Food("Hot dog","4.7",R.drawable.hotdog));
        arrayFood.add(new Food("Pizza","8.4",R.drawable.pizza));
        arrayFood.add(new Food("french fries","4.4",R.drawable.frenchfries));
        arrayFood.add(new Food("Cafe","3.2",R.drawable.cafe));
    }

}