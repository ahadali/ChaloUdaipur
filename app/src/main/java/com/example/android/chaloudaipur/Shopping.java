package com.example.android.chaloudaipur;


class Shopping {
    private int mImageResourceId;

    private String mShoppingName;

    private String mShoppingDescription;

    private String mShoppingDirections;

    Shopping(int imageResourceId, String shoppingName, String shoppingDescription, String shoppingDirections) {
        this.mImageResourceId = imageResourceId;
        this.mShoppingName = shoppingName;
        this.mShoppingDescription = shoppingDescription;
        this.mShoppingDirections = shoppingDirections;
    }

    int getImageResourceId() {
        return mImageResourceId;
    }

    String getShoppingName() {
        return mShoppingName;
    }

    String getShoppingDescription() {
        return mShoppingDescription;
    }

    String getShoppingDirections() {
        return mShoppingDirections;
    }
}
