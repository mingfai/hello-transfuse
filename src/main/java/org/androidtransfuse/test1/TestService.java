package org.androidtransfuse.test1;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.List;

@Singleton public class TestService {
    @Inject List<TestEntry> entries;
}
