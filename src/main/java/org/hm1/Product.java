package org.hm1;

abstract public class Product {
    private String name;
    private int cost;

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Product(String name, int cost, double volume) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "HomeTask2.Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
