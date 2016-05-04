/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.model.beverages.frappuccino;


/**
 * A Mocha flavoured frappuccino
 *
 * @author colin
 */
public class MochaFrappuccino extends Frappuccino {

    /**
     * {@inheritDoc}
     */
    @Override
    public double cost() {
        return 3.45;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public String description() {
        return "Mocha Frappuccino";
    }

}
