/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.model;

/**
 * A Single Shot Expresso
 *
 * @author colin
 */
public class SingleShotExpresso extends Expresso {

    /**
     * {@inheritDoc}
     */
    @Override
    public double cost() {
        return super.cost(); // by default we serve Expresso as single shot
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public String description() {
        return "Single shot of " + super.description();
    }
}
