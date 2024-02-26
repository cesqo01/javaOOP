package org.example;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineBottleOfWater implements VendingMachine {
    List<Product> productList = new ArrayList<>();

    public void addBottleOfWatter(BottleOfWater bottle){
        productList.add(bottle);
    }
    @Override
    public void initProducts(List<Product> list) {
        productList = list;

    }

    @Override
    public Product getProduct(String name) {
        for (Product i: productList) {
            if (i.getName().equals(name))
                return i;

        }
        return null;
    }
}
