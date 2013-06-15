package org.androidtransfuse;

import org.androidtransfuse.annotations.*;

import javax.inject.Inject;
import javax.inject.Named;

// Example Transfuse Activity
@Activity(label = "@string/app_name")
@IntentFilter({
        @Intent(type = IntentType.ACTION, name = android.content.Intent.ACTION_MAIN),
        @Intent(type = IntentType.CATEGORY, name = android.content.Intent.CATEGORY_LAUNCHER)
})
@Layout(R.layout.activity_main)
public class HelloAndroid {

    @Inject
    @View(R.id.textview)
    private android.widget.TextView textView;

    @Inject
    @Named("packageName")
    private String packageName;

    @Inject
    private android.app.Application application;

    @Inject @Resource(R.string.hello)
    private String helloText;

    @Inject
    private Injector injector;

    @OnCreate
    public void hello() {
        textView.setText(helloText + ": " +
                packageName + " : " +
                injector.getPetstore(application) + " : " +
                Factories.get(Injector.class).getPackageName(application));
    }
}