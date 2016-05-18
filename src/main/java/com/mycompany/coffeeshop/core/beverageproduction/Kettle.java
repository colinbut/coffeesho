/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.core.beverageproduction;

import com.mycompany.coffeeshop.model.MenuItem;
import com.mycompany.coffeeshop.model.beverages.Beverage;
import com.mycompany.coffeeshop.model.beverages.tea.ChaiTea;
import com.mycompany.coffeeshop.model.beverages.tea.EnglishBreakfast;

/**
 * @author colin
 */
public class Kettle implements BeverageFactory {


    /**
     * {@inheritDoc}
     */
    @Override
    public Beverage produceBeverage(MenuItem menuItem) {

        Beverage beverage;

        if (menuItem == MenuItem.ENGLISH_BREAKFAST_TEA) {
            beverage = new EnglishBreakfast();
        } else if (menuItem == MenuItem.CHAI_TEA) {
            beverage = new ChaiTea();
        } else  {
            throw new IllegalArgumentException();
        }

        return beverage;

    }
}
