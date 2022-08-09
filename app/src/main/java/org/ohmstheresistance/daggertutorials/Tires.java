package org.ohmstheresistance.daggertutorials;

import android.util.Log;

public class Tires {

    private static final String TAG = "Car";
    //Say for example I don't own this class and cannot annotate with @inject..Wheels in this example could be from a
// third party library. Rims and Wheels are from third party libraries in this eg as well so no @Inject allowed.

    public void inflate(){
        Log.d(TAG, "Tires are now inflated.");
    }
}
