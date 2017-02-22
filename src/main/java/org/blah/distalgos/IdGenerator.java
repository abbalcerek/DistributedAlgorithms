package org.blah.distalgos;

import java.util.Collection;
import java.util.SortedSet;

/**
 * Created by adam on 22.02.17.
 */
public interface IdGenerator {

    long generate();
    long generate(long lastId);
    long generate(SortedSet<Long> previousIds);
    long generate(Collection<Long> previousIds);
}
