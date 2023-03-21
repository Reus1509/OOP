package model.eats;

public class AmericanCookie extends Cookie {
    private String name;
    private Integer price;
    private Integer weight;
    private String filling;

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

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    @Override
    public Integer getPrice() {
        return price;
    }

    @Override
    public void setPrice(Integer price) {
        this.price = price;
    }

    public AmericanCookie() {
    }

    public AmericanCookie(String name, Integer price, Integer weight, String filling) {
        this.name = name;
        this.weight = weight;
        this.filling = filling;
        this.price = price;
    }


}
