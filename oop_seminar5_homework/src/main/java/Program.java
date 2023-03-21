//import hw_4.drinks.Coffee;
//import hw_4.drinks.Product;
//import hw_4.drinks.Tea;
//import hw_4.vendingMachines.HotSellVendingMachine;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;

import service.AllSellVendingMachine;
import model.drinks.BottleOfWater;
import model.drinks.Coffee;
import model.drinks.Tea;
import model.eats.AmericanCookie;
import model.eats.OatmealCookie;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        //HotSellVendingMachine HSVM1 = new HotSellVendingMachine();
        //List<Product> hd = new ArrayList<>(Arrays.asList(new Coffee("Капучино", 50, 100, 90),
         //       new Coffee("Американо", 40, 200, 85), new Tea("Черный чай", 40, 200, 85)));
        //HSVM1.initProduct(hd);
        //System.out.println(HSVM1.getProduct("Черный чай", 200, 85));
        //System.out.println(HSVM1.getProduct("Капучино", 200, 85));
        //System.out.println(HSVM1.getProduct("Капучино"));
        //System.out.println(HSVM1.getProduct("Капучино", 100, 90));
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
