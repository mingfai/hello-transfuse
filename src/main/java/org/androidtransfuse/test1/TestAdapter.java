package org.androidtransfuse.test1;

import android.app.Activity;
import android.widget.ArrayAdapter;
import org.androidtransfuse.R;

import javax.inject.Inject;
import java.util.List;

public class TestAdapter extends ArrayAdapter<TestEntry> {
    @Inject List<TestEntry> entries;

    @Inject public TestAdapter(Activity ctx) {super(ctx, R.layout.test1_textview);}
}
