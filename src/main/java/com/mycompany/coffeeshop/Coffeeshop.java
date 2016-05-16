package com.mycompany.coffeeshop;

import com.mycompany.coffeeshop.core.Barista;
import com.mycompany.coffeeshop.core.Cashier;
import com.mycompany.coffeeshop.core.Customer;
import com.mycompany.coffeeshop.core.Waiter;
import com.mycompany.coffeeshop.core.beverageproduction.*;

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

    private static BeverageFactory coffeeMachine;
    private static BeverageFactory kettle;
    private static BeverageFactory waterTap;
    private static BeverageFactory hotChocolateMachine;
    private static BeverageFactory icedDrinksMixer;


    /**
     * Constructor
     */
    public CoffeeShop() {
        cashier = new Cashier(barista);
        customer = new Customer(cashier);

        coffeeMachine = new CoffeeMachine();
        kettle = new Kettle();
        waterTap = new WaterTap();
        hotChocolateMachine = new HotChocolateMachine();
        icedDrinksMixer = new IcedDrinksMixer();
    }


    /**
     * Starts business
     */
    public void startTrading() {
        new Thread(barista).start();
        new Thread(waiter).start();

        new Thread(customer).start();
    }

    public static BeverageFactory getHotChocolateMachine() {
        return hotChocolateMachine;
    }

    public static BeverageFactory getIcedDrinksMixer() {
        return icedDrinksMixer;
    }

    public static BeverageFactory getKettle() {
        return kettle;
    }

    public static BeverageFactory getWaterTap() {
        return waterTap;
    }

    public static BeverageFactory getCoffeeMachine() {
        return coffeeMachine;
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
