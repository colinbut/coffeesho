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
public class SingleShotExpressoOrder implements Order {

    private Barista barista;

    /**
     * Constructor
     *
     * @param barista
     */
    public SingleShotExpressoOrder (Barista barista) {
        this.barista = barista;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public void makeBeverage() {
        barista.takeOrder(MenuItem.SINGLE_SHOT_EXPRESSO);
    }

}
