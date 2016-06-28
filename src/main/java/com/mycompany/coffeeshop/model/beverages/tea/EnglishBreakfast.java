/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.model.beverages.tea;

/**
 * @author colin
 */
public class EnglishBreakfast extends Tea {

    /**
     * {@inheritDoc}
     */
    @Override
    public double cost() {
        return 1.00;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String description() {
        return "English Breakfast " + super.description();
    }

}
