/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.model.beverages.frappuccino;

/**
 * A Caramel Frappuccino
 *
 * @author colin
 */
public class CaramelFrappuccino extends Frappuccino {

    /**
     * {@inheritDoc}
     */
    @Override
    public double cost() {
        return 3.40;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public String description() {
        return "Caramel Frappuccino";
    }

}
