/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.model;

/**
 * The Beverage
 *
 * A beverage can be anything from:
 *
 * <ul>
 *     <li>Coffee</li>
 *     <li>Tea</li>
 *     <li>Frappucinos</li>
 *     <li>Hot chocolates</li>
 * </ul>
 *
 * @author colin
 */
public interface Beverage {

    /**
     * Gets the cost of particular beverage
     *
     * @return the cost of the beverage
     */
    double cost();

    /**
     * A description that provides a descriptive representation of the beverage
     *
     * @return a description describing the beverage
     */
    String description();
}
