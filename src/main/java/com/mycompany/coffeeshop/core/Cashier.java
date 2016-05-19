/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.core;

import com.mycompany.coffeeshop.core.orderprocessing.*;
import com.mycompany.coffeeshop.model.MenuItem;

import java.util.ArrayList;
import java.util.List;

/**
 * The cashier i.e. the person taking payment from the customer (You)
 *
 * @author colin
 */
public class Cashier {

    private List<Order> orders = new ArrayList<>();

    private Barista barista;

    /**
     * Constructor
     *
     * @param barista the barista who makes the beverages
     */
    public Cashier(Barista barista) {
        this.barista = barista;
    }


    /**
     * Takes orders from the Customers
     *
     * @param beverageChoice the choice of beverages
     */
    void takeOrders(MenuItem beverageChoice) {

        switch (beverageChoice){
            case AMERICANO:
                orders.add(new AmericanoOrder(barista));
                break;
            case CAPPUCCINO:
                orders.add(new CappuccinoOrder(barista));
                break;
            case CORTADO:
                orders.add(new CortadoOrder(barista));
                break;
            case EXPRESSO_CON_PANNA:
                orders.add(new ExpressoConPannaOrder(barista));
                break;
            case SINGLE_SHOT_EXPRESSO:
                orders.add(new SingleShotExpressoOrder(barista));
                break;
            case DOUBLE_SHOT_EXPRESSO:
                orders.add(new DoubleShotExpressoOrder(barista));
                break;
            case FLAT_WHITE:
                orders.add(new FlatWhiteOrder(barista));
                break;
            case MACCHIATO:
                orders.add(new MacchiatoOrder(barista));
                break;
            case PICCINO:
                orders.add(new PiccinoOrder(barista));
                break;
            case RISTRETTO:
                orders.add(new RistrettoOrder(barista));
                break;
            case MOCHA:
                orders.add(new MochaOrder(barista));
                break;
            case FILTER_COFFEE:
                orders.add(new FilterCoffeeOrder(barista));
                break;
            case LATTE:
                orders.add(new LatteOrder(barista));
                break;
            case ALMOND_LATTE:
                orders.add(new AlmondLatteOrder(barista));
                break;
            case CARAMEL_LATTE:
                orders.add(new CaramelLatterOrder(barista));
                break;
            case HAZELNUT_LATTE:
                orders.add(new HazelnutLatteOrder(barista));
                break;
            case TOFFEE_LATTE:
                orders.add(new ToffeeLatteOrder(barista));
                break;
            case VANILLA_LATTE:
                orders.add(new VanillaLatteOrder(barista));
                break;
            case NUTMEG_LATTE:
                orders.add(new NutmegLatteOrder(barista));
                break;
            case GINGERBREAD_LATTE:
                orders.add(new GingerbreadLatteOrder(barista));
                break;
            case EGGNOG_LATTE:
                orders.add(new EggnogLatteOrder(barista));
                break;
            case CARAMEL_FRAPPUCCINO:
                orders.add(new CaramelFrappuccinoOrder(barista));
                break;
            case CHOCOLATE_FRAPPUCCINO:
                orders.add(new ChocolateFrappuccinoOrder(barista));
                break;
            case MOCHA_FRAPPUCCINO:
                orders.add(new MochaFrappuccinoOrder(barista));
                break;
            case STRAWBERRIES_AND_CREAM_FRAPPUCCINO:
                orders.add(new StrawberriesAndCreamFrappuccinoOrder(barista));
                break;
            case ENGLISH_BREAKFAST_TEA:
                orders.add(new EnglishBreakfastTeaOrder(barista));
                break;
            case CHAI_TEA:
                orders.add(new ChaiTeaOrder(barista));
                break;
            case HOT_CHOCOLATE:
                orders.add(new HotChocolateOrder(barista));
                break;
            case WATER:
                orders.add(new WaterOrder(barista));
                break;
            default:
                break;
        }

    }


    /**
     * Sends the customer orders to the Barista
     */
    void sendOrdersToBarista() {
        for(Order order : orders) {
            order.makeBeverage();
        }
    }


}
