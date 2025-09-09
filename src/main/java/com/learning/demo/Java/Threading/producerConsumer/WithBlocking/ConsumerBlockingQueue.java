package com.learning.demo.Java.Threading.producerConsumer.WithBlocking;

import java.util.concurrent.BlockingQueue;

public class ConsumerBlockingQueue implements Runnable {
    private BlockingQueue<Integer> queue;

    public ConsumerBlockingQueue(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }


    @Override
    public void run() {
        try{
            while (true) {
                System.out.println("Consumer "+ queue.take() );
                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
