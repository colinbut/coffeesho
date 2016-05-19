/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.core.orderprocessing;

import com.mycompany.coffeeshop.core.Barista;
import com.mycompany.coffeeshop.model.MenuItem;

/**
 * @author colin
 */
public class EnglishBreakfastTeaOrder implements Order {

    private Barista barista;


    /**
     * Constructor
     *
     * @param barista
     */
    public EnglishBreakfastTeaOrder(Barista barista) {
        this.barista = barista;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public void makeBeverage() {
        barista.takeOrder(MenuItem.ENGLISH_BREAKFAST_TEA);
    }
}
