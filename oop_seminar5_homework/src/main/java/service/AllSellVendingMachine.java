package service;

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

        public List<E> getProductList() {
            return allProducts;
        }

        public <Product> String getProduct(String name) {
            for (E prod:allProducts
            ) {
                if(prod.getName().equals(name)){
                    if(prod instanceof Coffee || prod instanceof Tea){return "РРјСЏ: " + prod.getName() + " Р¦РµРЅР°: " + prod.getPrice() + " РћР±СЉРµРј: " + prod.getVolume() + " РўРµРјРїРµСЂР°С‚СѓСЂР°: " + prod.getTemperature();}
                    if(prod instanceof AmericanCookie){return "РРјСЏ: " + prod.getName() + " Р¦РµРЅР°: " + prod.getPrice() + " РћР±СЉРµРј: " + ((AmericanCookie) prod).getWeight() + " РќР°РїРѕР»РЅРёС‚РµР»СЊ: " + ((AmericanCookie) prod).getFilling();}
                    if(prod instanceof OatmealCookie){return "РРјСЏ: " + prod.getName() + " Р¦РµРЅР°: " + prod.getPrice() + " РћР±СЉРµРј: " +  ((OatmealCookie) prod).getWeight() + " СЃ С€РѕРєРѕР»Р°РґРѕРј: " + ((OatmealCookie) prod).getWithChocolate();}
                    return "РРјСЏ: " + prod.getName() + " Р¦РµРЅР°: " + prod.getPrice();
                }
            }
            return new Coffee("РЅРµ РЅР°Р№РґРµРЅРѕ", 0,0,0).toString();
        }


        public void addProduct(E product) {
            allProducts.add(product);
        }

        @Override
        public String toString() {
            return "AllSellVendingMachine{" +
                    "name='" + name + '\'' +
                    ", height=" + height +
                    ", allProducts=" + allProducts +
                    '}';
        }
    }

