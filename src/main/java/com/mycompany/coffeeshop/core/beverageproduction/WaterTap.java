/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.core.beverageproduction;

import com.mycompany.coffeeshop.model.MenuItem;
import com.mycompany.coffeeshop.model.beverages.Beverage;
import com.mycompany.coffeeshop.model.beverages.Water;

/**
 * A water tap
 *
 * Turn the tap that drips out cold water
 *
 * @author colin
 */
public class WaterTap implements BeverageFactory {

    /**
     * {@inheritDoc}
     */
    @Override
    public Beverage produceBeverage(MenuItem menuItem) {

        if (menuItem != MenuItem.WATER) {
            throw new IllegalArgumentException();
        }

        return new Water();
    }
}
