package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by carlosblanco on 11/30/16.
 */

public class OtherNaturalPlaces extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.object_list);

        final ArrayList<TourAppObject> objects = new ArrayList<TourAppObject>();
        objects.add(new TourAppObject(R.string.otherNaturalPlacesColoniaTovar, R.string.otherNaturalPlacesColoniaTovarDescription,
                R.drawable.colonia_tovar_2));
        objects.add(new TourAppObject(R.string.otherNaturalPlacesLlanos, R.string.otherNaturalPlacesLlanosDescription,
                R.drawable.llanos_2));
        objects.add(new TourAppObject(R.string.otherNaturalPlacesMedanosDeCoro, R.string.otherNaturalPlacesMedanosDeCoroDescription,
                R.drawable.medanos_de_coro));
        objects.add(new TourAppObject(R.string.otherNaturalPlacesPicoBolivar, R.string.otherNaturalPlacesPicoBolivarDescription,
                R.drawable.pico_bolivar));
        objects.add(new TourAppObject(R.string.otherNaturalPlacesGranSabana, R.string.otherNaturalPlacesGranSabanaDescription,
                R.drawable.gran_sabana_salto_angel));

        ListView listView = (ListView) findViewById(R.id.object_list);
        listView.setAdapter(new TourAppAdapter(this, objects, R.color.otherNaturalPlacesCategoryColor));


    }
}
