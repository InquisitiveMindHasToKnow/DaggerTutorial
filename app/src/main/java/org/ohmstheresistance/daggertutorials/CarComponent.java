package org.ohmstheresistance.daggertutorials;

import dagger.Component;

@Component
public interface CarComponent {

    Car getCar();

    //inject the activity you want to use..MainActivity in this eg.
    //Each activity needs its own inject method. (name of method does not matter.)
    void inject(MainActivity mainActivity);
}
