/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.core;

import com.mycompany.coffeeshop.CoffeeShop;
import com.mycompany.coffeeshop.core.beverageproduction.*;
import com.mycompany.coffeeshop.model.MenuItem;
import com.mycompany.coffeeshop.model.beverages.Beverage;
import com.mycompany.coffeeshop.model.beverages.coffee.Latte;
import com.mycompany.coffeeshop.model.extras.Soy;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * A barista
 *
 * They make beverages in a coffee shop
 *
 * @author colin
 */
public class Barista implements Runnable {

    static String beverageMade;
    static final Object lock = new Object();
    private static int coffeeNumber = 1;

    private BeverageFactory coffeeMachine;
    private BeverageFactory kettle;
    private BeverageFactory tap;
    private BeverageFactory icedDrinksMixer;
    private BeverageFactory hotChocolateMachine;

    private BlockingQueue<MenuItem> orderQueue = new ArrayBlockingQueue<>(10);

    /**
     * Constructor
     */
    public Barista() {
        coffeeMachine = CoffeeShop.getCoffeeMachine();
        kettle = CoffeeShop.getKettle();
        tap = CoffeeShop.getWaterTap();
        icedDrinksMixer = CoffeeShop.getIcedDrinksMixer();
        hotChocolateMachine = CoffeeShop.getHotChocolateMachine();
    }


    /**
     * Takes beverage orders from the Cashier
     *
     * The caller (Cashier) expected to invoke this method which
     * will insert the beverage into the queue of orders for this barista to
     * brew
     *
     * @param beverage the beverage to make
     */
    public void takeOrder(MenuItem beverage) {
        try {
            // using put - make the Cashier wait
            // cashier - don't accept any more orders...
            orderQueue.put(beverage);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    /**
     * Produces the beverage
     */
    private void makeBeverage() {
        synchronized (lock) {
            if (beverageMade != null) {
                try {
                    System.out.println("Barista: " + " Waiting for waiter notification to deliver the beverage");
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                Beverage beverage = brewBeverage();
                beverageMade = "Beverage No." + coffeeNumber++ + " - " + beverage.description();
                lock.notifyAll();
                System.out.println("Barista: notifying the Waiter to pick the beverage");
            }

        }
    }

    /**
     * Method no longer used
     *
     * @return a random beverage made
     */
    @Deprecated
    private String makeRandomBeverage() {
        Beverage beverage = new Latte();
        beverage = new Soy(beverage);
        System.out.println("Barista: made " + beverage.description());
        return beverage.description();
    }


    /**
     * Makes the beverage
     *
     * @return
     */
    private Beverage brewBeverage() {

        Beverage beverage = null;

        try {
            // Barista wait for orders to come in
            MenuItem beverageToMake = orderQueue.take();

            if (Beverage.isCoffee(beverageToMake)) {
                beverage = coffeeMachine.produceBeverage(beverageToMake);
            } else if (Beverage.isHotChocolate(beverageToMake)) {
                beverage = hotChocolateMachine.produceBeverage(beverageToMake);
            } else if (Beverage.isTea(beverageToMake)) {
                beverage = kettle.produceBeverage(beverageToMake);
            } else if (Beverage.isWater(beverageToMake)) {
                beverage = tap.produceBeverage(beverageToMake);
            } else if (Beverage.isFrappuccino(beverageToMake)) {
                beverage = icedDrinksMixer.produceBeverage(beverageToMake);
            } else {
                throw new IllegalStateException("Internal orders queue somehow has an invalid menu item");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return beverage;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        while (true) {
            System.out.println("Taking orders from queue of orders");
            System.out.println("Making another coffee now");
            makeBeverage();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
