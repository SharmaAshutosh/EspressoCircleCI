package com.freenow.android_demo.misc;

import com.google.android.gms.maps.model.LatLng;

public final class Constants {

    private Constants() {
    }

    // Tag
    public static final String LOG_TAG = "FRN";

    // Network
    public static final int SOCKET_TIMEOUT = 60;

    // Location
    public static final float DEFAULT_ZOOM = 18.0f;
    public static final LatLng DEFAULT_LOCATION = new LatLng(53.544604, 9.928757); // FREE NOW Hamburg office

}
