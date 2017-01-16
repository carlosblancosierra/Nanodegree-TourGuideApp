package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by carlosblanco on 11/30/16.
 */

public class Cities extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.object_list);

        final ArrayList<TourAppObject> objects = new ArrayList<TourAppObject>();
        objects.add(new TourAppObject(R.string.citiesCaracas, R.string.citiesCaracasDescription,
                R.drawable.caracas));
        objects.add(new TourAppObject(R.string.citiesMaracaibo, R.string.citiesMaracaiboDescription,
                R.drawable.maracaibo));
        objects.add(new TourAppObject(R.string.citiesPuertoLaCruz, R.string.citiesPuertoLaCruzDescription,
                R.drawable.puerto_la_cruz));
        objects.add(new TourAppObject(R.string.citiesValencia, R.string.citiesValenciaDescription,
                R.drawable.valencia_2));
        objects.add(new TourAppObject(R.string.citiesMerida, R.string.citiesMeridaDescription,
                R.drawable.merida));

        ListView listView = (ListView) findViewById(R.id.object_list);
        listView.setAdapter(new TourAppAdapter(this, objects, R.color.citiesCategoryColor));
    }
}
