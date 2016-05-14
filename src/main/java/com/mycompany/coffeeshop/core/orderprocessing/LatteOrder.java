/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.core.orderprocessing;

import com.mycompany.coffeeshop.core.Barista;

/**
 * An order to make a latte beverage
 *
 * Note* Command of the Command Pattern
 *
 * @author colin
 */
public class LatteOrder implements Order {

    private Barista barista;

    /**
     * Constructor
     *
     * @param barista the barista to brew beverage
     */
    public LatteOrder(Barista barista) {
        this.barista = barista;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void makeBeverage() {
        barista.makeBeverage("Latte");
    }
}
