package com.labs.java.thread;

public class Worker extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " >>> entering into worker thread");
        System.out.println(Thread.currentThread().getName() + " <<< entering from worker thread");
    }
}
