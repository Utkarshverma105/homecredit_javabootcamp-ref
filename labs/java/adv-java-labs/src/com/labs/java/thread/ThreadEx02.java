package com.labs.java.thread;

/**
 * Creates Thread by extending Thread class
 */
public class ThreadEx02 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " >>> entering into main thread");

        Worker t1 = new Worker(); // Thread-0
        t1.setName("T1");
        t1.start();
        t1.print(); // called from main thread

//        Worker t2 = new Worker(); // Thread-1
//        t2.setName("T2");
//        t2.setDaemon(true); // runs in background with less priority
//        t2.start();
//        t2.print(); // called from main thread

//        Master t3 = new Master(); // Thread-2
//        t3.setName("T3");
//        t3.start();
//        t3.print(); // called from main thread

        Thread.sleep(2000);

        System.out.println(Thread.currentThread().getName() + " <<< exiting from main thread");
    }

    public static class Worker extends Thread {
        int sum = 0;

        // main => 0 + 0 = 0
        // main => 0 + 1 = 1
        // main => 1 + 2 = 3
        // main => 3 + 3 = 6

        // T1 => 0 + 0 = 0
        // T1 => 0 + 1 = 1
        // T1 => 1 + 2 = 3
        // T1 => 3 + 3 = 6

        public void run() {
            System.out.println(Thread.currentThread().getName() + " >>> entering into worker thread");
            print(); // called from worker thread
            System.out.println(Thread.currentThread().getName() + " <<< exiting from worker thread");
        }

        public synchronized void print() {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " - " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                sum += i;
            }
            System.out.println(Thread.currentThread().getName() + " - Sum is " + sum);
            sum = 0;
        }
    }

    public static class Master extends Thread {
        public void run() {
            System.out.println(Thread.currentThread().getName() + " >>> entering into master thread");
            print(); // called from worker thread
            System.out.println(Thread.currentThread().getName() + " <<< exiting from master thread");
        }

        public void print() {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " - " + i);
            }

        }
    }
}
