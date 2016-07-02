/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A waiter
 *
 * @author colin
 */
public class Waiter implements Runnable {

    private static final Logger LOGGER = LoggerFactory.getLogger(Waiter.class);

    /**
     * Retrieves the coffee from the coffee machine
     */
    private void deliverBeverage() {
        synchronized (Barista.lock) {
            if (Barista.beverageMade == null) {
                try {
                    //System.out.println("Waiter: Will get new orders in the meantime while Coffee Machine makes the coffee");
                    LOGGER.info("Waiter: Will wait in the meantime while Barista makes the next beverage");
                    Barista.lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                //System.out.println("Waiter: Delivering " + Barista.beverageMade + " to customer");
                LOGGER.info("Waiter: Delivering {} to customer", Barista.beverageMade);
                Barista.beverageMade = null;
                Barista.lock.notifyAll();
                //System.out.println("Waiter: Notifying the coffee machine to make next one");
                LOGGER.info("Waiter: Notifying the barista ready to deliver make next one");
            }
        }
    }



    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        // constantly delivering coffee to customers
        // it's a busy coffee shop (lunch hour :) )
        while (!Thread.currentThread().isInterrupted()) {
            deliverBeverage();
        }
    }

}
