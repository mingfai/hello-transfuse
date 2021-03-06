package org.androidtransfuse.test3;

import android.widget.ListView;
import org.androidtransfuse.R;
import org.androidtransfuse.annotations.*;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

@org.androidtransfuse.annotations.Activity(label = "@string/app_name")
@Layout(R.layout.test1_activity)
public class Test {
    @Inject @View(R.id.test1_list) ListView list;
    @Inject TestAdapter adapter;
    @Inject TestService service;


    @OnCreate public void onCreate() {
       // list.setAdapter(adapter);
    }

    @TransfuseModule
    public static class Module {
        @Provides @Singleton List<TestEntry> getEntries() {
            return new ArrayList<TestEntry>();
        }
    }

}
