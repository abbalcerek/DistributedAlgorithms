package org.blah.distalgos;

import java.util.Random;

/**
 * Created by adam on 22.02.17.
 */
public class Utils {

    public static void sleepRandom(long millis) {
        try {
            Thread.sleep(Math.abs(new Random().nextLong()) % millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
