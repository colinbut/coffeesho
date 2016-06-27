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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

    private static final Logger LOGGER = LoggerFactory.getLogger(Barista.class);

    static String beverageMade;
    static final Object lock = new Object();
    private static int coffeeNumber = 1;

    private final BeverageFactory coffeeMachine;
    private final BeverageFactory kettle;
    private final BeverageFactory tap;
    private final BeverageFactory icedDrinksMixer;
    private final BeverageFactory hotChocolateMachine;

    private final BlockingQueue<MenuItem> orderQueue = new ArrayBlockingQueue<>(10);

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
            LOGGER.info("Barista: Cashier sent order - {}", beverage);
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
                    //System.out.println("Barista: Waiting for waiter notification to deliver the beverage");
                    LOGGER.info("Barista: Waiting for waiter notification to deliver the beverage");
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                Beverage beverage = brewBeverage();
                beverageMade = "Beverage No." + coffeeNumber++ + " - " + beverage.description();
                LOGGER.debug("Barista: Made beverage: {}", beverageMade);

                lock.notifyAll();
                //System.out.println("Barista: notifying the Waiter to pick the beverage");
                LOGGER.info("Barista: notifying the Waiter to pick up the beverage");
            }

        }
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

            LOGGER.debug("Barista: Taking order {} from orderQueue", beverageToMake);

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

        LOGGER.info("Barista: Made {}", beverage);

        return beverage;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        while (true) {
            //System.out.println("Taking orders from queue of orders");
            //System.out.println("Making another beverage now");

            makeBeverage();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
