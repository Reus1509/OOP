package hw2.market.buyers;

public class Human extends Buyer {

    public Human(String name, boolean isMakeOrder, boolean isTakeOrder) {
        super.name = name;
        super.isMakeOrder = isMakeOrder;
        super.isTakeOrder = isTakeOrder;
    }

        @Override
    public void setMakeOrder() {

    }

    @Override
    public void setTakeOrder() {

    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", isMakeOrder=" + isMakeOrder +
                ", isTakeOrder=" + isTakeOrder +
                '}';
    }
}
