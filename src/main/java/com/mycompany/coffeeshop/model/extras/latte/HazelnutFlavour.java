/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.model.extras.latte;

import com.mycompany.coffeeshop.model.beverages.coffee.Latte;

/**
 * Hazelnut
 *
 * @author colin
 */
public class HazelnutFlavour extends LatteFlavour{

    /**
     * Constructor
     *
     * @param latte
     */
    public HazelnutFlavour(Latte latte) {
        super(latte);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double cost() {
        return super.cost() + 0.5;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public String description() {
        return super.description() + ", with Hazelnut";
    }
}
