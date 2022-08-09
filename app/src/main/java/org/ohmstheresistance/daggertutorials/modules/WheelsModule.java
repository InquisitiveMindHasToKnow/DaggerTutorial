package org.ohmstheresistance.daggertutorials.modules;

import org.ohmstheresistance.daggertutorials.Rims;
import org.ohmstheresistance.daggertutorials.Tires;
import org.ohmstheresistance.daggertutorials.Wheels;

import dagger.Module;
import dagger.Provides;

 //Modules are classes that contribute to the object graph
//Modules add objects to the dependency class using @provides methods if we cannot annotate the constructors
// with @Inject or if we need to do configuration after instantiating them.
 @Module
public class WheelsModule {
  //Whenever provides methods do not depend on instance states of module, an optimization could be making them
  // static which allows dagger to call methods directly as opposed to needing to instantiate the module.
   @Provides
    static Rims provideRimes(){
        return new Rims();
    }

    @Provides
    static Tires providesTires(){
       Tires tires = new Tires();
       tires.inflate();
       return tires;
    }

    //In real apps, you might have to use builder methods (eg Retrofit builder) as opposed to constructor calls but that can all
    // be done in a Provide method like one below. Just be sure to return what was provided.
    @Provides
   static Wheels provideWheels(Rims rims, Tires tires){
       return new Wheels(rims, tires);
    }
}
