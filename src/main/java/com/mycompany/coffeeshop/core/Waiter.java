/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.core;

/**
 * A waiter
 *
 * @author colin
 */
public class Waiter implements Runnable {

    /**
     * Retrieves the coffee from the coffee machine
     */
    private void getCoffee() {
        synchronized (Barista.lock) {
            if (Barista.coffeeMade == null) {
                try {
                    System.out.println("Waiter: Will get new orders in the meantime while Coffee Machine makes the coffee");
                    Barista.lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Waiter: Delivering " + Barista.coffeeMade + " to customer");
                Barista.coffeeMade = null;
                Barista.lock.notifyAll();
                System.out.println("Waiter: Notifying the coffee machine to make next one");
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
        while (true) {
            getCoffee();
        }
    }

}
