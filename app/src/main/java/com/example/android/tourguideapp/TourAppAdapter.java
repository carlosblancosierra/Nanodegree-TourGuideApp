package com.example.android.tourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by carlosblanco on 11/30/16.
 */

public class TourAppAdapter extends ArrayAdapter<TourAppObject> {

    private int mColor;

    public TourAppAdapter(Activity context, ArrayList<TourAppObject> object, int color) {

        super(context, 0, object);
        mColor = color;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.items_layout, parent, false);
        }

        TourAppObject currentObject = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        nameTextView.setText(currentObject.getName());

        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_text_view);
        descriptionTextView.setText(currentObject.getDescription());

        ImageView firstImageView = (ImageView) listItemView.findViewById(R.id.first_image_view);
        firstImageView.setImageResource(currentObject.getFirstImageResourceID());

        LinearLayout linearLayout = (LinearLayout) listItemView.findViewById(R.id.items_layout);
        linearLayout.setBackgroundResource(mColor);

        return listItemView;
    }
}
