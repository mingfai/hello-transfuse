package org.androidtransfuse;

import android.app.Application;

/**
 * @author John Ericksen
 */
public class PetStore {

    private Application application;

    public PetStore(Application application) {
        this.application = application;
    }

    public String toString(){
        return "Petstore for " + application.getPackageName();
    }
}
