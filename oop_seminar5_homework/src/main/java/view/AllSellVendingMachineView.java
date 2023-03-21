package view;

import model.drinks.BottleOfWater;
import model.drinks.Coffee;
import model.drinks.Tea;
import model.eats.AmericanCookie;
import model.eats.OatmealCookie;
import service.AllSellVendingMachine;

import java.util.ArrayList;
import java.util.List;

public class AllSellVendingMachineView {
    public static void work(){
        List allProducts = new ArrayList<>();
        AllSellVendingMachine APVM = new AllSellVendingMachine<>(allProducts, "first", 180);
        APVM.addProduct(new Coffee("Американо", 150, 200, 90));
        APVM.addProduct(new Tea("Черный чай", 30, 150, 85));
        APVM.addProduct(new AmericanCookie("ЯшкиноАм", 80, 200, "клубника"));
        APVM.addProduct(new OatmealCookie("ЯшкиноОвс", 50, 250, true));
        APVM.addProduct(new BottleOfWater("Кула", 100));
        System.out.println(APVM);
        System.out.println(APVM.getProductList());
        System.out.println(APVM.getProduct("Черный чай"));
        System.out.println(APVM.getProduct("ЯшкиноАм"));
        System.out.println(APVM.getProduct("ЯшкиноОвс"));
    }
}
