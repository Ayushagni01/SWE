package com.learning.demo.Java.Threading.producerConsumer.Without;

public class ProdConsMain {
    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();

        //Thread 1
        Thread produce = new Thread(() -> {
            try{
                pc.produce();
            }catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        //Thread 2
        //Thread 1
        Thread consume = new Thread(() -> {
            try{
                pc.consume();
            }catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        produce.start();
        consume.start();
    }
}
