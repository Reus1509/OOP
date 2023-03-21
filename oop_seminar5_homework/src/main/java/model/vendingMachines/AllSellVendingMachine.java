package model.vendingMachines;

import model.drinks.Coffee;
import model.drinks.Product;
import model.drinks.Tea;
import model.eats.AmericanCookie;
import model.eats.OatmealCookie;

import java.util.List;


public class AllSellVendingMachine<E extends Product> {
    private String name;
    private Integer height;

    public AllSellVendingMachine(List<E> allProducts, String name, Integer height) {
        this.allProducts = allProducts;
        this.name = name;
        this.height = height;
    }

    private List<E> allProducts;

    @Override
    public String toString() {
        return "AllSellVendingMachine{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", allProducts=" + allProducts +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public List<E> getAllProducts() {
        return allProducts;
    }

    public void setAllProducts(List<E> allProducts) {
        this.allProducts = allProducts;
    }

    public AllSellVendingMachine(String name, Integer height, List<E> allProducts) {
        this.name = name;
        this.height = height;
        this.allProducts = allProducts;
    }
}
