package org.blah.distalgos;

import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Created by adam on 22.02.17.
 */
public class SynchronizationService {

    public Map<String, SortedSet<Long>> idMap = new TreeMap<>();

    public void registerClass(Class clazz) {
        if (idMap.containsKey(clazz.toGenericString())) {
            System.out.println("Class " + clazz + " already registered!");
        } else {
            idMap.put(clazz.toGenericString(), new TreeSet<Long>());
        }
    }

    public long getId(Class clazz) {
        synchronized (this) {
            long newId = new SimpleGenerator().generate(idMap.get(clazz.toGenericString()));
            idMap.get(clazz.toGenericString()).add(newId);
            return newId;
        }
    }

}
