package model.vendingMachines;

import model.drinks.Product;

import java.util.List;

public abstract class VendingMachine{

    public abstract List<Product> initProduct(List<Product> products);


    public abstract String getProduct(String name);
}
