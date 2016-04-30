package com.mycompany.coffeeshop;

/**
 * Coffee Shop
 *
 * @author colin
 */
public class Coffeeshop {

    /**
     * Main program
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Coffeeshop");
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Waiter waiter = new Waiter();
        coffeeMachine.start();
        waiter.start();
    }
}
