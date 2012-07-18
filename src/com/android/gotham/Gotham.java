package com.android.gotham;

import android.app.Activity;
import android.os.Bundle;

public class Gotham extends Activity {

    private GothamView mView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mView = new GothamView(this);
        setContentView(mView);
    }
}
