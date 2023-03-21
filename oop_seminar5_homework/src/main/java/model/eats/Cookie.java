package model.eats;

import model.drinks.Product;

public class Cookie extends Product {
    protected String name;

    @Override
    public String toString() {
        return "Cookie{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", volume=" + volume +
                ", temperature=" + temperature +
                '}';
    }

    protected Integer weight;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Cookie() {
    }

    public Cookie(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
    }
}
