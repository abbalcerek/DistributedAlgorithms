package org.blah.distalgos;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by adam on 21.02.17.
 */
public class SimpleNone extends Thread {

    private long nodeId;
    private BlockingQueue<SimpleMessage> queue = new SynchronousQueue<>();


    public SimpleNone(long id) {
        super();
        this.nodeId = id;
    }

    @Override
    public void run() {
        System.out.println("Initializing node with " + nodeId);
        for (int i = 0; i < 10; i++) {
            Utils.sleepRandom(2000);
            System.out.println("Node " + nodeId + " hart beat.");
        }
    }

}
