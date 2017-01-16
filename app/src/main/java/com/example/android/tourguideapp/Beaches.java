package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by carlosblanco on 11/30/16.
 */

public class Beaches extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.object_list);

        final ArrayList<TourAppObject> objects = new ArrayList<TourAppObject>();
        objects.add(new TourAppObject(R.string.beachesLosRoques, R.string.beachesLosRoques_description,
                R.drawable.beaches_los_roques_2));
        objects.add(new TourAppObject(R.string.beachesChoroni, R.string.beachesChoroniDescription,
                R.drawable.beaches_choroni));
        objects.add(new TourAppObject(R.string.beachesMochima, R.string.beachesMochimaDescription,
                R.drawable.beaches_mochima_2));
        objects.add(new TourAppObject(R.string.beachesMorrocoy, R.string.beachesMorrocoyDescription,
                R.drawable.beaches_morrocoy));
        objects.add(new TourAppObject(R.string.beachesPlayaElAgua, R.string.beachesPlayaElAguaDescription,
                R.drawable.beaches_playa_el_agua_2));

        ListView listView = (ListView) findViewById(R.id.object_list);
        listView.setAdapter(new TourAppAdapter(this, objects, R.color.beachesCategoryColor));
    }
}
