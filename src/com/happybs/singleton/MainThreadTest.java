package com.happybs.singleton;

public class MainThreadTest extends Thread {
    public MainThreadTest(String name) {
        super(name);
    }

    public static void main(String[] args) {
        System.out.println("Start.");
        new MainThreadTest("A").start();
        new MainThreadTest("B").start();
        new MainThreadTest("C").start();
        System.out.println("End");
    }

    public void run() {
        Singleton obj = Singleton.getInstance();
        System.out.println(getName() + ": obj = " + obj);
    }
}
