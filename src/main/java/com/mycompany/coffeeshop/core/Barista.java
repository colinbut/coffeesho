/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.core;

import com.mycompany.coffeeshop.model.beverages.Beverage;
import com.mycompany.coffeeshop.model.beverages.Latte;
import com.mycompany.coffeeshop.model.extras.SoyBeverage;

/**
 * @author colin
 */
public class Barista implements Runnable {

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
                    System.out.println("Barista: " + " Waiting for waiter notification to deliver the coffee");
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                coffeeMade = "Coffee No." + coffeeNumber++ + " - " + makeRandomBeverage();
                lock.notifyAll();
                System.out.println("Barista: notifying the Waiter to pick the coffee");
            }

        }
    }

    private String makeRandomBeverage() {
        Beverage beverage = new Latte();
        beverage = new SoyBeverage(beverage);
        System.out.println("Barista: made " + beverage.description());
        return beverage.description();
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
