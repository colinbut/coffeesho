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
public final class Menu {

    private static volatile Menu INSTANCE;

    private Map<Integer, MenuItem> menuOptions = new HashMap<>();


    private Menu(){
        init();
    }


    /**
     * Populates the menu with items
     */
    private void init() {
        for (int i = 1; i <= MenuItem.values().length; i++) {
            menuOptions.put(i, MenuItem.values()[i]);
        }
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


    public Map<Integer, MenuItem> getMenu() {
        return menuOptions;
    }
}
