/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.model.extras.latte;

import com.mycompany.coffeeshop.model.beverages.coffee.Latte;

/**
 * Abstraction for a flavour of Latte
 *
 * This is a Decorator
 *
 * @author colin
 */
public abstract class LatteFlavour extends Latte {


    protected final Latte latte;

    /**
     * Constructor
     *
     * @param latte
     */
    public LatteFlavour(Latte latte) {
        this.latte = latte;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public double cost() {
        return latte.cost();
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public String description() {
        return latte.description();
    }

}
