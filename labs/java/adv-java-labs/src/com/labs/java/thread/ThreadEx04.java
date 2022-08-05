package com.labs.java.thread;

import java.util.concurrent.*;

/**
 * Creates Thread by implementing Runnable interface
 */
public class ThreadEx04 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        System.out.println(Thread.currentThread().getName() + " >>> entering into main thread");

        // creates single thread
//        ExecutorService es = Executors.newSingleThreadExecutor();
        // creates fixed no of threads
        ExecutorService es = Executors.newFixedThreadPool(2);
        // creates threads dynamically
//        ExecutorService es = Executors.newCachedThreadPool();
        Worker w1 = new Worker();
        Future<Integer> f1 = es.submit(w1);

        while(!f1.isDone()) {
            System.out.println("Processing...");
            Thread.sleep(100);
        }
        System.out.println("Worker1 Sum is - " + f1.get());
//        w1.print();

        Worker w2 = new Worker();
        Future<Integer> f2 = es.submit(w2);
        System.out.println("Worker2 Sum is - " + f2.get());

        Worker w3 = new Worker();
        es.submit(w3);

        Thread.sleep(2000);

        es.shutdown(); // destroys all threads

        System.out.println(Thread.currentThread().getName() + " <<< exiting from main thread");
    }

    public static class Worker implements Callable<Integer> {
        int sum = 0;

        public Integer call() {
            System.out.println(Thread.currentThread().getName() + " >>> entering into worker thread");
            Integer sum = print(); // called from worker thread
            System.out.println(Thread.currentThread().getName() + " <<< exiting from worker thread");
            return sum;
        }

        public synchronized Integer print() {
            sum = 0;
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " - " + i);
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                sum += i;
            }
            System.out.println(Thread.currentThread().getName() + " - Sum is " + sum);
//            sum = 0;
            return sum;
        }
    }
}
