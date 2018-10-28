package com.example.android.chaloudaipur;


class Venues {

    private int mImageResourceId;

    private String mVenueName;

    private String mVenueDescription;

    private String mVenueLocation;

    Venues(int imageResourceId, String venueName, String venueDescription, String venueLocation) {
        this.mImageResourceId = imageResourceId;
        this.mVenueName = venueName;
        this.mVenueDescription = venueDescription;
        this.mVenueLocation = venueLocation;
    }

    int getImageResourceId() {
        return mImageResourceId;
    }

    String getVenueName() {
        return mVenueName;
    }

    String getVenueDescription() {
        return mVenueDescription;
    }

    String getVenueLocation() {
        return mVenueLocation;
    }
}
