package com.mycompany.coffeeshop;

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
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Waiter waiter = new Waiter();
        coffeeMachine.start();
        waiter.start();
    }
}
