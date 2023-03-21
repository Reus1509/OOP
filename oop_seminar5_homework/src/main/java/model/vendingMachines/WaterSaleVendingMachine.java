package model.vendingMachines;

import model.drinks.Product;
import model.drinks.BottleOfWater;

import java.util.ArrayList;
import java.util.List;

public class WaterSaleVendingMachine extends VendingMachine {
    List<Product> bottlesOfWater = new ArrayList<>();
    @Override
    public List<Product> initProduct(List<Product> bottles) {
        this.bottlesOfWater = bottles;
        return bottles;
    }

    @Override
    public String getProduct(String name) {
        for (Product bow:bottlesOfWater
             ) {
            if(bow.getName().equals(name)) return bow.getName() + " " + bow.getPrice();
        }
        return new BottleOfWater("не найдено", 0).toString();
    };

}
