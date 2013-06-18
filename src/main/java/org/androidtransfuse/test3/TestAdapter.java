package org.androidtransfuse.test3;

import android.app.Activity;
import android.widget.ArrayAdapter;
import org.androidtransfuse.R;
import org.androidtransfuse.annotations.Observes;

import javax.inject.Inject;
import java.util.List;

public class TestAdapter extends ArrayAdapter<TestEntry> {
    private List<TestEntry> entries;

    @Inject public TestAdapter(Activity ctx, List<TestEntry> entires) {
        super(ctx, R.layout.test1_textview);
        this.entries = entires;
    }

    @Observes public void observeUpdate(TestEvent event){
        //... do update work
    }
}
