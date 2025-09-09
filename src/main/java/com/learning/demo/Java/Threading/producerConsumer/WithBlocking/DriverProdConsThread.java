package com.learning.demo.Java.Threading.producerConsumer.WithBlocking;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class DriverProdConsThread {
    public static void main(String[] args) {
        BlockingQueue<Integer > queue = new ArrayBlockingQueue<>(5);
        Thread prod = new Thread(new ProducerBlockingQueue(queue));
        Thread con = new Thread(new ConsumerBlockingQueue(queue));
        prod.start();
        con.start();
    }
}
