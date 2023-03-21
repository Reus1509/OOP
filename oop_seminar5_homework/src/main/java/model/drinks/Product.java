package model.drinks;

public abstract class Product{
    protected String name;
    protected Integer price;

    protected Integer volume;

    protected Integer temperature;

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    protected void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getVolume() {
        return volume;
    }

    protected void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Integer getTemperature() {
        return temperature;
    }

    protected void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }
}
