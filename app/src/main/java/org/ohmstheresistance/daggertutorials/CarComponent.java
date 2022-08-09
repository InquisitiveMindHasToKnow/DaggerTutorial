package org.ohmstheresistance.daggertutorials;

import org.ohmstheresistance.daggertutorials.modules.WheelsModule;

import dagger.Component;

@Component (modules = WheelsModule.class)
public interface CarComponent {

    Car getCar();

    //inject the activity you want to use..MainActivity in this eg.
    //Each activity needs its own inject method. (name of method does not matter.)
    void inject(MainActivity mainActivity);
}
