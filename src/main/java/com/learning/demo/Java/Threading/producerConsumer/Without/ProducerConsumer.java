package com.learning.demo.Java.Threading.producerConsumer.Without;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ProducerConsumer {
    private Queue<Integer> buffer = new LinkedList<>();
    int capacity =  5;

    public void produce() throws InterruptedException {
        int value = 0;
        while(true) {
            synchronized (this) {

                if( buffer.size() == capacity){
                    wait();
                }

                //produced
                System.out.println("Produced "+ value);
                buffer.add(value++);

                notifyAll();
            }
            Thread.sleep(1000);
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                //check the
                if( buffer.size() == 0) {
                    wait();
                }

                System.out.println("Consumed" + buffer.poll());

                notifyAll();
            }
            Thread.sleep(1000);
        }

    }
}
