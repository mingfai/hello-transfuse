package org.androidtransfuse;

import org.androidtransfuse.annotations.*;

import javax.inject.Inject;

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

    @Inject @Resource(R.string.hello)
    private String helloText;

    @OnCreate
    public void hello() {
        textView.setText(helloText);
    }
}