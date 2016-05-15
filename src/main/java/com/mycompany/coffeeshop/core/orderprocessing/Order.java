/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.core.orderprocessing;

/**
 * Encapsulation of an 'order'
 *
 * A customer would placed their orders to the cashiers
 *
 * @author colin
 */
public interface Order {

    /**
     * Produces the beverage
     */
    void makeBeverage();
}
