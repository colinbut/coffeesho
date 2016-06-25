/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.core;

import com.mycompany.coffeeshop.model.Menu;
import com.mycompany.coffeeshop.model.MenuItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

/**
 * The customer
 *
 * @author colin
 */
public class Customer implements Runnable {

    private static final Logger LOGGER = LoggerFactory.getLogger(Customer.class);

    private final Cashier cashier;

    // (possible) maximum of drinks that a customer wants to order
    private static final int MAX_NUMBER_OF_DRINKS = 5;

    // the time between each drink order in milliseconds
    private static final int TIME_BETWEEN_ORDER_MS = 5000;

    /**
     * Constructor
     *
     * @param cashier the person taking payment
     */
    public Customer(Cashier cashier) {
        this.cashier = cashier;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(TIME_BETWEEN_ORDER_MS);
                LOGGER.info("Customer: ordering drinks after {} have passed", TIME_BETWEEN_ORDER_MS);
                orderDrinks();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Order drinks
     */
    void orderDrinks() {
        int randomNumberOfDrinks = ThreadLocalRandom.current().nextInt(1, MAX_NUMBER_OF_DRINKS);
        LOGGER.debug("Customer: ordering {} drinks", randomNumberOfDrinks);
        for (int i = 0; i < randomNumberOfDrinks; i++) {
            MenuItem beverageToOrder = orderRandomBeverage();
            LOGGER.info("Customer: decided ordering {}", beverageToOrder);

            cashier.takeOrders(beverageToOrder);
        }
        cashier.sendOrdersToBarista();
    }


    /**
     * Choose a random choice of beverage from the menu
     *
     * @return the chosen beverage menu number
     */
    private MenuItem orderRandomBeverage() {
        Map<Integer, MenuItem> menu = Menu.getInstance().getMenu();
        int randomChoice = ThreadLocalRandom.current().nextInt(1,menu.size());
        LOGGER.debug("Customer: picking menu number: {}", randomChoice);
        return menu.get(randomChoice);
    }
}
