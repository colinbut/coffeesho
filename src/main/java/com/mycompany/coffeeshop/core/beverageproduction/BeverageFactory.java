/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.core.beverageproduction;

import com.mycompany.coffeeshop.model.MenuItem;
import com.mycompany.coffeeshop.model.beverages.Beverage;

/**
 * @author colin
 */
public interface BeverageFactory {

    /**
     * Produces the beverages
     *
     * @param menuItem the beverage from the menu to make
     * @return the produced beverage
     */
    Beverage produceBeverage(MenuItem menuItem);
}
