package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by carlosblanco on 12/1/16.
 */

public class Food extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.object_list);

        final ArrayList<TourAppObject> objects = new ArrayList<TourAppObject>();
        objects.add(new TourAppObject(R.string.foodArepa, R.string.foodArepaDescription,
                R.drawable.arepa_2));
        objects.add(new TourAppObject(R.string.foodCachapa, R.string.foodCachapaDescription,
                R.drawable.cachapa));
        objects.add(new TourAppObject(R.string.foodEmpanada, R.string.foodEmpanadaDescription,
                R.drawable.empanada));
        objects.add(new TourAppObject(R.string.foodPatacon, R.string.foodPataconDescription,
                R.drawable.patacon_2));
        objects.add(new TourAppObject(R.string.foodPabellon, R.string.foodPabellonDescription,
                R.drawable.pabellon));

        ListView listView = (ListView) findViewById(R.id.object_list);
        listView.setAdapter(new TourAppAdapter(this, objects, R.color.foodCategoryColor));
    }
}