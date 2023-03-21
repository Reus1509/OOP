package model.eats;

public class OatmealCookie extends Cookie {
    private String name;
    private Integer price;
    private Integer weight;
    private Boolean withChocolate;

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

    public Boolean getWithChocolate() {
        return withChocolate;
    }

    @Override
    public Integer getPrice() {
        return price;
    }

    @Override
    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setWithChocolate(Boolean withChocolate) {
        this.withChocolate = withChocolate;
    }

    public OatmealCookie() {
    }

    public OatmealCookie(String name, Integer price, Integer weight, Boolean withChocolate) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.withChocolate = withChocolate;
    }
}
