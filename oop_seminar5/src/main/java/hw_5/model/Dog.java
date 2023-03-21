package hw_5.model;

public class Dog extends Animal{
    private Boolean sterilized;
    private Boolean thoroughbred;

    public Dog(String name, Integer age, Float weigth, Float height, Boolean sterilized, Boolean thoroughbred) {
        super(name, age, weigth, height);
        this.sterilized = sterilized;
        this.thoroughbred = thoroughbred;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "sterilized=" + sterilized +
                ", thoroughbred=" + thoroughbred +
                '}';
    }

    public Boolean getSterilized() {
        return sterilized;
    }

    public void setSterilized(Boolean sterilized) {
        this.sterilized = sterilized;
    }

    public Boolean getThoroughbred() {
        return thoroughbred;
    }

    public void setThoroughbred(Boolean thoroughbred) {
        this.thoroughbred = thoroughbred;
    }
}
