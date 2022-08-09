package org.ohmstheresistance.daggertutorials;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";
    
    private Engine engine;
    private Wheels wheels;

    //Dagger order of injection: Constructor -> Field/Variables -> Methods
    //Field and method injections are only automatically injected if there is a constructor injection.
    //Method injections are rarely used and usually not in activities
    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }
    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }
    
    public void drive(){
        Log.d(TAG, "drive: Driving.....");
    }
}
