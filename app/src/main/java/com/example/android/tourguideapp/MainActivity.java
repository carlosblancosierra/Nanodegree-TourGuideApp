package com.example.android.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView beaches = (TextView) findViewById(R.id.beaches);

        beaches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent beaches = new Intent(MainActivity.this, Beaches.class);
                startActivity(beaches);
            }
        });

        TextView otherNaturalPlaces = (TextView) findViewById(R.id.other_natural_places);

        otherNaturalPlaces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherNaturalPlaces = new Intent(MainActivity.this, OtherNaturalPlaces.class);
                startActivity(otherNaturalPlaces);
            }
        });

        TextView cities = (TextView) findViewById(R.id.cities);

        cities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cities = new Intent(MainActivity.this, Cities.class);
                startActivity(cities);
            }
        });

        TextView food = (TextView) findViewById(R.id.food);

        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent food = new Intent(MainActivity.this, Food.class);
                startActivity(food);
            }
        });

    }
}
