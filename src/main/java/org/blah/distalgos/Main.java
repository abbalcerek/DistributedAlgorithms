package org.blah.distalgos;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by adam on 21.02.17.
 */
public class Main {

    public static void main(String... args) {
        System.out.println("Welcome to Distributed Algorithms project!");

        ExecutorService service = Executors.newFixedThreadPool(20);
        SynchronizationService synchronizationService = new SynchronizationService();

        synchronizationService.registerClass(SimpleNone.class);

        for (int i = 0; i < 10; i ++)
            service.execute(new SimpleNone(synchronizationService.getId(SimpleNone.class)));
    }

}
