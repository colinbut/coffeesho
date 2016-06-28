/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.model;

import java.math.BigDecimal;

/**
 * Representation of a menu item on the menu
 *
 * @author colin
 */
public enum MenuItem {

    //coffees
    AMERICANO(1.95),
    CAPPUCCINO(2.25),
    CORTADO(2.30),
    EXPRESSO_CON_PANNA(2.30),
    SINGLE_SHOT_EXPRESSO(2.30),
    DOUBLE_SHOT_EXPRESSO(2.30),
    FLAT_WHITE(2.30),
    MACCHIATO(2.30),
    PICCINO(2.30),
    RISTRETTO(2.30),
    MOCHA(3.30),
    FILTER_COFFEE(1.50),

    // lattes
    LATTE(2.25),
    CARAMEL_LATTE(3.25),
    ALMOND_LATTE(3.25),
    HAZELNUT_LATTE(3.25),
    TOFFEE_LATTE(3.25),
    VANILLA_LATTE(3.25),
    NUTMEG_LATTE(3.25),
    GINGERBREAD_LATTE(3.25),
    EGGNOG_LATTE(3.25),

    // Frappuccinos
    CARAMEL_FRAPPUCCINO(3.40),
    CHOCOLATE_FRAPPUCCINO(3.40),
    MOCHA_FRAPPUCCINO(3.40),
    STRAWBERRIES_AND_CREAM_FRAPPUCCINO(3.40),

    // Tea
    TEA(2.30),
    ENGLISH_BREAKFAST_TEA(2.89),
    CHAI_TEA(3.00),

    // Hot Choc
    HOT_CHOCOLATE(2.30),

    WATER(0.00);

    private final BigDecimal price;

    MenuItem(double price) {
        this.price = BigDecimal.valueOf(price);
    }

    public BigDecimal getPrice() {
        return price;
    }


}
