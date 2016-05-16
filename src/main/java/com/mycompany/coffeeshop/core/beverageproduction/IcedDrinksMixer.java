/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.core.beverageproduction;

import com.mycompany.coffeeshop.model.MenuItem;
import com.mycompany.coffeeshop.model.beverages.Beverage;
import com.mycompany.coffeeshop.model.beverages.frappuccino.CaramelFrappuccino;
import com.mycompany.coffeeshop.model.beverages.frappuccino.ChocolateFrappuccino;
import com.mycompany.coffeeshop.model.beverages.frappuccino.MochaFrappuccino;
import com.mycompany.coffeeshop.model.beverages.frappuccino.StrawberriesAndCreamFrappuccino;

/**
 * A mixer
 *
 * @author colin
 */
public class IcedDrinksMixer implements BeverageFactory{

    /**
     * {@inheritDoc}
     */
    @Override
    public Beverage produceBeverage(MenuItem menuItem) {

        Beverage beverage;

        if (menuItem == MenuItem.CARAMEL_FRAPPUCCINO) {
            beverage = new CaramelFrappuccino();
        } else if (menuItem == MenuItem.CHOCOLATE_FRAPPUCCINO) {
            beverage = new ChocolateFrappuccino();
        } else if (menuItem == MenuItem.MOCHA_FRAPPUCCINO) {
            beverage = new MochaFrappuccino();
        } else if (menuItem == MenuItem.STRAWBERRIES_AND_CREAM_FRAPPUCCINO) {
            beverage = new StrawberriesAndCreamFrappuccino();
        } else {
            throw new IllegalArgumentException();
        }

        return beverage;
    }
}
