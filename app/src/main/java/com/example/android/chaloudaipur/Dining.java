package com.example.android.chaloudaipur;


class Dining {

    private int mImageResourceId;

    private String mDiningName;

    private String mDiningLocation;

    private String mDiningWebsite;

    private String mDiningPhoneNumber;

    private String mDiningTimings;

    private String mDiningRatings;

    Dining(int imageResourceId, String diningName, String diningLocation, String diningWebsite, String diningPhoneNumber, String diningTimings, String diningRatings) {
        this.mImageResourceId = imageResourceId;
        this.mDiningName = diningName;
        this.mDiningLocation = diningLocation;
        this.mDiningWebsite = diningWebsite;
        this.mDiningPhoneNumber = diningPhoneNumber;
        this.mDiningTimings = diningTimings;
        this.mDiningRatings = diningRatings;
    }

    int getImageResourceId() {
        return mImageResourceId;
    }

    String getDiningName() {
        return mDiningName;
    }

    String getDiningLocation() {
        return mDiningLocation;
    }

    String getDiningWebsite() {
        return mDiningWebsite;
    }

    String getDiningPhoneNumber() {
        return mDiningPhoneNumber;
    }

    String getDiningTimings() {
        return mDiningTimings;
    }

    String getDiningRatings() {
        return mDiningRatings;
    }
}
