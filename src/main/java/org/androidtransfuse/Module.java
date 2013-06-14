package org.androidtransfuse;

import android.app.Application;
import org.androidtransfuse.annotations.Provides;
import org.androidtransfuse.annotations.TransfuseModule;

import javax.inject.Named;

/**
 * @author John Ericksen
 */
@TransfuseModule
public class Module {

    @Provides
    @Named("packageName")
    public String getName(Application application){
        return application.getPackageName();
    }
}
