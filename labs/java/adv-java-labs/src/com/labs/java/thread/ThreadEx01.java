package com.labs.java.thread;

/**
 * Thread Basics
 */
public class ThreadEx01 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " >>> entering into main method");
        System.out.println("Thread ID: " + Thread.currentThread().getId());
        System.out.println("State: " + Thread.currentThread().getState());
        System.out.println("Priority: " + Thread.currentThread().getPriority());
        System.out.println("Waiting...");
        try {
            Thread.sleep(5000); // sleep for 2 secs
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " <<< entering from main method");
    }
}
