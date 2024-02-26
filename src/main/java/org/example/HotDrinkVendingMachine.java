package org.example;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {
    List<Product> hotList = new ArrayList<>();

    public void addHotDrink(HotDrink bottle){
        hotList.add(bottle);
    }
    @Override
    public void initProducts(List<Product> list) {
        hotList = list;

    }

    @Override
    public Product getProduct(String name) {
        for (Product j: hotList) {
            if (j.getName().equals(name))
                return j;

        }
        return null;
    }
    public Product getProduct(String name, int temperature, double volume) {
        for (Product j : hotList) {
            if (j instanceof HotDrink hotDrink && j.getName().equals(name)) {
                if (hotDrink.getTemperature() == temperature && hotDrink.getVolume() == volume) {
                    return hotDrink;
                }
            }
        }
        return null;
    }

}
