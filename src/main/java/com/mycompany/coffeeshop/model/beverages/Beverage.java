/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.model.beverages;

import com.mycompany.coffeeshop.model.Menu;
import com.mycompany.coffeeshop.model.MenuItem;

import java.util.HashSet;
import java.util.Set;

/**
 * The Beverage
 * <p>
 * A beverage can be anything from:
 * <p>
 * <ul>
 * <li>Coffee</li>
 * <li>Tea</li>
 * <li>Frappucinos</li>
 * <li>Hot chocolates</li>
 * </ul>
 *
 * @author colin
 */
public interface Beverage {

    Set<MenuItem> coffees = new HashSet<MenuItem>(){
        {
            add(MenuItem.AMERICANO);
            add(MenuItem.CAPPUCCINO);
            add(MenuItem.EXPRESSO_CON_PANNA);
            add(MenuItem.SINGLE_SHOT_EXPRESSO);
            add(MenuItem.DOUBLE_SHOT_EXPRESSO);
            add(MenuItem.MACCHIATO);
            add(MenuItem.PICCINO);
            add(MenuItem.MOCHA);
            add(MenuItem.CORTADO);
            add(MenuItem.RISTRETTO);
            add(MenuItem.FLAT_WHITE);
            add(MenuItem.LATTE);
            add(MenuItem.CARAMEL_LATTE);
            add(MenuItem.ALMOND_LATTE);
            add(MenuItem.HAZELNUT_LATTE);
            add(MenuItem.NUTMEG_LATTE);
            add(MenuItem.EGGNOG_LATTE);
            add(MenuItem.VANILLA_LATTE);
            add(MenuItem.GINGERBREAD_LATTE);
            add(MenuItem.TOFFEE_LATTE);
            add(MenuItem.FILTER_COFFEE);
        }
    };

    Set<MenuItem> frappuccinos = new HashSet<MenuItem>(){
        {
            add(MenuItem.CARAMEL_FRAPPUCCINO);
            add(MenuItem.CHOCOLATE_FRAPPUCCINO);
            add(MenuItem.MOCHA_FRAPPUCCINO);
            add(MenuItem.STRAWBERRIES_AND_CREAM_FRAPPUCCINO);
        }
    };

    Set<MenuItem> teas = new HashSet<MenuItem>(){
        {
            add(MenuItem.ENGLISH_BREAKFAST_TEA);
            add(MenuItem.CHAI_TEA);
        }
    };


    static boolean isFrappuccino(MenuItem menuItem) {
        return frappuccinos.contains(menuItem);
    }

    static boolean isCoffee(MenuItem menuItem) {
        return coffees.contains(menuItem);
    }


    static boolean isTea(MenuItem menuItem) {
        return teas.contains(menuItem);
    }


    static boolean isWater(MenuItem menuItem) {
        return menuItem.equals(MenuItem.WATER);
    }

    static boolean isHotChocolate(MenuItem menuItem) {
        return menuItem.equals(MenuItem.HOT_CHOCOLATE);
    }


    /**
     * Gets the cost of particular beverage
     *
     * @return the cost of the beverage
     */
    double cost();

    /**
     * A description that provides a descriptive representation of the beverage
     *
     * @return a description describing the beverage
     */
    String description();
}
