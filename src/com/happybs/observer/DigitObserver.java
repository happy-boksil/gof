package com.happybs.observer;


public class DigitObserver implements Observer {
    public void update(NumberGenerator generator) {
        System.out.println("DigitalObserver:" + generator.getNumber());
        try {
            Thread.sleep(100);
        } catch(InterruptedException e) {

        }
    }
}
