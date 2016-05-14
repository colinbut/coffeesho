/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.model;

import java.util.HashMap;
import java.util.Map;

/**
 * The menu
 *
 * @author colin
 */
public class Menu {

    private static volatile Menu INSTANCE;

    private Map<Integer, String> menuOptions = new HashMap<>();

    private Menu(){
        menuOptions.put(1, "Latte");
    }


    public static Menu getInstance() {
        if (INSTANCE == null) {
            synchronized (Menu.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Menu();
                }
            }
        }
        return INSTANCE;
    }


    public Map<Integer, String> getMenu() {
        return menuOptions;
    }
}
