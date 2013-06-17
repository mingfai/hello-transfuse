package org.androidtransfuse.test3;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.List;

@Singleton public class TestService {
    @Inject List<TestEntry> entries;
    //service needs the adapter to do notifyDataSetChange, there could be alternative design for sure
    @Inject TestAdapter adapter;
}
