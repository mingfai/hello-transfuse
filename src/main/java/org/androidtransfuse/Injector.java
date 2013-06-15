package org.androidtransfuse;

import android.app.Application;
import org.androidtransfuse.annotations.Factory;

import javax.inject.Named;

/**
 * @author John Ericksen
 */
@Factory
public interface Injector {

    PetStore getPetstore(Application application);

    @Named("packageName")
    String getPackageName(Application application);
}
