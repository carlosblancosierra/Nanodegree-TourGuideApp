package com.example.android.tourguideapp;

/**
 * Created by carlosblanco on 11/30/16.
 */

public class TourAppObject {

    private int mName;
    private int mDescription;
    private int mFirstImageResourceID;

    public TourAppObject (int name, int description, int firstImageResourceID
    ) {
        mName = name;
        mDescription = description;
        mFirstImageResourceID = firstImageResourceID;
    }

    public int getName() {
        return mName;
    }

    public int getDescription() {
        return mDescription;
    }

    public int getFirstImageResourceID() {
        return mFirstImageResourceID;
    }
}
