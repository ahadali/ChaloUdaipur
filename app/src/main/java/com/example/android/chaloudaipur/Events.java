package com.example.android.chaloudaipur;


class Events {

    private int mImageResourceId;

    private String mEventName;

    private String mEventPaidOrFree;

    Events(int imageResourceId, String eventName, String eventPaidOrFree) {
        this.mImageResourceId = imageResourceId;
        this.mEventName = eventName;
        this.mEventPaidOrFree = eventPaidOrFree;
    }

    int getImageResourceId() {
        return mImageResourceId;
    }

    String getEventName() {
        return mEventName;
    }

    String getEventPaidOrFree() {
        return mEventPaidOrFree;
    }
}
