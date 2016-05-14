/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.core;

import com.mycompany.coffeeshop.model.Menu;

import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

/**
 * The customer
 *
 * @author colin
 */
public class Customer implements Runnable {

    private final Cashier cashier;

    // (possible) maximum of drinks that a customer wants to order
    private static final int MAX_NUMBER_OF_DRINKS = 5;

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
        int randomNumberOfDrinks = ThreadLocalRandom.current().nextInt(MAX_NUMBER_OF_DRINKS);
        for (int i = 0; i < randomNumberOfDrinks; i++) {
            cashier.takeOrders(orderRandomBeverage());
        }
    }


    /**
     * Choose a random choice of beverage from the menu
     *
     * @return the chosen beverage menu number
     */
    private String orderRandomBeverage() {
        Map<Integer, String> menu = Menu.getInstance().getMenu();
        int randomChoice = ThreadLocalRandom.current().nextInt(menu.size());
        return menu.get(randomChoice);
    }
}
