package com.mycompany.coffeeshop;

import com.mycompany.coffeeshop.core.Barista;
import com.mycompany.coffeeshop.core.Cashier;
import com.mycompany.coffeeshop.core.Customer;
import com.mycompany.coffeeshop.core.Waiter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Coffee Shop
 *
 * @author colin
 */
public class CoffeeShop {

    private Barista barista = new Barista();
    private Waiter waiter = new Waiter();
    private Cashier cashier;

    private Customer customer;

    /**
     * Constructor
     */
    public CoffeeShop() {
        cashier = new Cashier(barista);
        customer = new Customer(cashier);
    }


    public Barista getBarista() {
        return barista;
    }


    /**
     * Starts business
     */
    public void startTrading() {
        new Thread(barista).start();
        new Thread(waiter).start();

        new Thread(customer).start();
    }



    /**
     * Main program
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("CoffeeShop");
        new CoffeeShop().startTrading();
    }
}
