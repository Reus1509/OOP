package hw2.market.market;

import hw2.market.buyers.Human;

public class Program {
    public static void main(String[] args) {
        Human men2 = new Human("Никита", true, true);
        Human men3 = new Human("Александр", true, false);
        Human men4 = new Human("Михаил", false, false);
        Human men5 = new Human("Петр", true, false);
        Market market1 = new Market();
        market1.acceptToMarket(men2);
        market1.acceptToMarket(men3);
        market1.acceptToMarket(men4);
        market1.acceptToMarket(men5);
        System.out.println("Все покупатели в магазине " + market1.allBuyers);
        System.out.println("***************");
        market1.takeInQueue(men2);
        market1.takeInQueue(men3);
        System.out.println("очередь " + market1.allBuyersQueue);
        System.out.println("---------------");
        market1.update();
        market1.releaseFromQueue();
        System.out.println("очередь " + market1.allBuyersQueue);
        System.out.println("****************");
        market1.releaseFromMarket(market1.allBuyers);
        System.out.println("Все покупатели в магазине " + market1.allBuyers);
    }
}
