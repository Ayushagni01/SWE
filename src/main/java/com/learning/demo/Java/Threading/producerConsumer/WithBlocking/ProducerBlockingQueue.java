package com.learning.demo.Java.Threading.producerConsumer.WithBlocking;

import java.util.concurrent.BlockingQueue;

public class ProducerBlockingQueue implements Runnable {
    private BlockingQueue<Integer> queue;

    public ProducerBlockingQueue(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try{
            int value = 0;
            while(true) {
                System.out.println("Produced "+value);
                queue.put(value++);
                Thread.sleep(1000);
            }

        }catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
