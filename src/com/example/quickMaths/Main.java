package com.example.quickMaths;

public class Main {

    public static Object lock1 = new Object();
    public static Object lock2 = new Object();

    public static void main(String[] args) {

    }

    private static class ThreadOne extends Thread {
        public void run() {
            synchronized (lock1) {
                System.out.println("thread 1: Has lock1");
                try{
                    Thread.sleep(100);
                }catch(InterruptedException e){

                }
                System.out.println("Thread1: Waiting for lock 2");
                synchronized (lock2){
                    System.out.println("Thread1: Has lock1 and lock2");
                }
                System.out.println("Thread 1: Released lock2");
            }
            System.out.println("Thread 1: Released lock1. Exiting....");
        }
    }

    private static class Thread2 extends Thread{
        public void run(){
            synchronized(lock2){
                System.out.println("Thread 2: has ");
            }
        }

    }
}

