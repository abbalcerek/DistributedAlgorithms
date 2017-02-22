package org.blah.distalgos;

import java.util.Collection;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by adam on 22.02.17.
 */
public class SimpleGenerator implements IdGenerator {


    @Override
    public long generate() {
        return 0;
    }

    @Override
    public long generate(long lastId) {
        return lastId + 1;
    }

    @Override
    public long generate(SortedSet<Long> previousIds) {
        if (previousIds == null) {
            throw new IllegalArgumentException();
        } else if (previousIds.isEmpty()) {
            return generate();
        } else {
            return generate(previousIds.last());
        }
    }

    @Override
    public long generate(Collection<Long> previousIds) {
        return generate(new TreeSet<>(previousIds));
    }
}
