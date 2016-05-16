/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.core.beverageproduction;

import com.mycompany.coffeeshop.model.MenuItem;
import com.mycompany.coffeeshop.model.beverages.Beverage;
import com.mycompany.coffeeshop.model.beverages.choc.HotChocolate;

/**
 * @author colin
 */
public class HotChocolateMachine implements BeverageFactory {

    /**
     * {@inheritDoc}
     */
    @Override
    public Beverage produceBeverage(MenuItem menuItem) {

        if (menuItem != MenuItem.HOT_CHOCOLATE) {
            throw new IllegalArgumentException();
        }

        return new HotChocolate();
    }
}
