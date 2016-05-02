package com.mycompany.coffeeshop;

import com.mycompany.coffeeshop.core.Barista;
import com.mycompany.coffeeshop.core.Waiter;

/**
 * Coffee Shop
 *
 * @author colin
 */
public class CoffeeShop {

    /**
     * Main program
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("CoffeeShop");
        new Thread(new Barista()).start();
        new Thread(new Waiter()).start();
    }
}
