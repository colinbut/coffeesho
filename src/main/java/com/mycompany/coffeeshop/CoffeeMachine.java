/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop;

/**
 * @author colin
 */
public class CoffeeMachine implements Runnable {

    static String coffeeMade;
    static final Object lock = new Object();
    private static int coffeeNumber = 1;

    /**
     * Produces the coffee
     */
    private void makeCoffee() {
        synchronized (lock) {
            if (coffeeMade != null) {
                try {
                    System.out.println("Coffee machine: " + " Waiting for waiter notification to deliver the coffee");
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                coffeeMade = "Coffee No." + coffeeNumber++;
                System.out.println("Coffee machine: " + "made " + coffeeMade);
                lock.notifyAll();
                System.out.println("Coffee machine: notifying the Waiter to pick the coffee");
            }

        }
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        while (true) {
            System.out.println("Making another coffee now");
            makeCoffee();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
