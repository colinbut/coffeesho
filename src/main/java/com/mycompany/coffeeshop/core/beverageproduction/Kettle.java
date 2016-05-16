/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.core.beverageproduction;

import com.mycompany.coffeeshop.model.MenuItem;
import com.mycompany.coffeeshop.model.beverages.Beverage;

public class Kettle implements BeverageFactory {


    /**
     * {@inheritDoc}
     */
    @Override
    public Beverage produceBeverage(MenuItem menuItem) {

        if (menuItem != MenuItem.TEA) {
            throw new IllegalArgumentException();
        }
        return null;
        //return new Tea();
    }
}
