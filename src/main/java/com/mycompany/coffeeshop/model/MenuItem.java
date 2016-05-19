/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.model;

/**
 * Representation of a menu item on the menu
 *
 * @author colin
 */
public enum MenuItem {

    //coffees
    AMERICANO(2.30),
    CAPPUCCINO(2.30),
    CORTADO(2.30),
    EXPRESSO_CON_PANNA(2.30),
    SINGLE_SHOT_EXPRESSO(2.30),
    DOUBLE_SHOT_EXPRESSO(2.30),
    FLAT_WHITE(2.30),
    MACCHIATO(2.30),
    PICCINO(2.30),
    RISTRETTO(2.30),
    MOCHA(2.30),
    FILTER_COFFEE(2.30),

    // lattes
    LATTE(2.30),
    CARAMEL_LATTE(2.30),
    ALMOND_LATTE(2.30),
    HAZELNUT_LATTE(2.30),
    TOFFEE_LATTE(2.30),
    VANILLA_LATTE(2.30),
    NUTMEG_LATTE(2.30),
    GINGERBREAD_LATTE(2.30),
    EGGNOG_LATTE(2.30),

    // Frappuccinos
    CARAMEL_FRAPPUCCINO(2.30),
    CHOCOLATE_FRAPPUCCINO(2.30),
    MOCHA_FRAPPUCCINO(2.30),
    STRAWBERRIES_AND_CREAM_FRAPPUCCINO(2.30),

    // Tea
    TEA(2.30),
    ENGLISH_BREAKFAST_TEA(2.30),
    CHAI_TEA(2.30),

    // Hot Choc
    HOT_CHOCOLATE(2.30),

    WATER(0.00);

    private double price;

    MenuItem(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }


}
