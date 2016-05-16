/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.core.beverageproduction;

import com.mycompany.coffeeshop.model.MenuItem;
import com.mycompany.coffeeshop.model.beverages.Beverage;
import com.mycompany.coffeeshop.model.beverages.coffee.*;
import com.mycompany.coffeeshop.model.extras.latte.*;

/**
 * Coffee Machine
 *
 * @author colin
 */
public class CoffeeMachine implements BeverageFactory {

    /**
     * {@inheritDoc}
     */
    @Override
    public Beverage produceBeverage(MenuItem menuItem) {

        Beverage beverage;

        if (menuItem == MenuItem.AMERICANO) {
            beverage = new Americano();
        } else if (menuItem == MenuItem.CAPPUCCINO) {
            beverage = new Cappuccino();
        } else if (menuItem == MenuItem.CORTADO) {
            beverage = new Cortado();
        } else if (menuItem == MenuItem.EXPRESSO_CON_PANNA) {
            beverage = new ExpressoConPanna(new Expresso());
        } else if (menuItem == MenuItem.SINGLE_SHOT_EXPRESSO) {
            beverage = new SingleShotExpresso();
        } else if (menuItem == MenuItem.DOUBLE_SHOT_EXPRESSO) {
            beverage = new DoubleShotExpresso();
        } else if (menuItem == MenuItem.FLAT_WHITE) {
            beverage = new FlatWhite();
        } else if (menuItem == MenuItem.MACCHIATO) {
            beverage = new Macchiato();
        } else if (menuItem == MenuItem.PICCINO) {
            beverage = new Piccino();
        } else if (menuItem == MenuItem.RISTRETTO) {
            beverage = new Ristretto();
        } else if (menuItem == MenuItem.MOCHA) {
            beverage = new Mocha();
        } else if (menuItem == MenuItem.FILTER_COFFEE) {
            beverage = new FilterCoffee();
        } else if (menuItem == MenuItem.LATTE) {
            beverage = new Latte();
        } else if (menuItem == MenuItem.CARAMEL_LATTE) {
            beverage = new CaramelFlavour(new Latte());
        } else if (menuItem == MenuItem.ALMOND_LATTE) {
            beverage = new AlmondFlavour(new Latte());
        } else if (menuItem == MenuItem.HAZELNUT_LATTE) {
            beverage = new HazelnutFlavour(new Latte());
        } else if (menuItem == MenuItem.TOFFEE_LATTE) {
            beverage = new ToffeeFlavour(new Latte());
        } else if (menuItem == MenuItem.VANILLA_LATTE) {
            beverage = new VanillaFlavour(new Latte());
        } else if (menuItem == MenuItem.NUTMEG_LATTE) {
            beverage = new NutmegFlavour(new Latte());
        } else if (menuItem == MenuItem.GINGERBREAD_LATTE) {
            beverage = new GingerBreadFlavour(new Latte());
        } else if (menuItem == MenuItem.EGGNOG_LATTE) {
            beverage = new EggnogFlavour(new Latte());
        } else {
            throw new IllegalArgumentException();
        }

        return beverage;
    }
}
