package org.ohmstheresistance.daggertutorials;

import javax.inject.Inject;

public class Wheels {
//Say for example I don't own this class and cannot annotate with @inject..Wheels in this example could be from a
// third party library. Rims and Tires are from third party libraries in this eg as well so no @Inject allowed.

    private Rims rims;
    private Tires tires;

    public Wheels(Rims rims, Tires tires){
        this.rims = rims;
        this.tires = tires;
    }
}
