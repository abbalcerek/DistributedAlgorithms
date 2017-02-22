package org.blah.distalgos;

/**
 * Created by adam on 22.02.17.
 */
public interface Id extends Comparable {

    Id next(Id id);
}
