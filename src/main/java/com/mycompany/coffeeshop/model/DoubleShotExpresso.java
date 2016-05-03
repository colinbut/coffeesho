/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.model;

/**
 * A Double-Shot Expresso
 *
 * @author colin
 */
public class DoubleShotExpresso extends Expresso {

    /**
     * {@inheritDoc}
     */
    @Override
    public double cost() {
        return super.cost() + 1.00;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public String description() {
        return "Double shot of " + super.description();
    }
}
