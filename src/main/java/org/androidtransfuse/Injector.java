package org.androidtransfuse;

import android.app.Application;
import android.content.Context;
import org.androidtransfuse.annotations.Factory;

import javax.inject.Named;

/**
 * @author John Ericksen
 */
@Factory
public interface Injector {

    public PetStore getPetstore(Application application);
}
