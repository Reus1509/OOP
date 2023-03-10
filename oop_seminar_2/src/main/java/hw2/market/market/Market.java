package hw2.market.market;

import hw2.market.buyers.Buyer;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Market implements MarketBehaviour,QueueBehaviour{
    List<Buyer> allBuyers = new LinkedList<>();
    Queue<Buyer> allBuyersQueue = new LinkedList<>();
    @Override
    public void acceptToMarket(Buyer actor) {
        allBuyers.add(actor);
    }

    @Override
    public void releaseFromMarket(List<Buyer> allBuyers) {
        allBuyers.remove(0);
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
    }

    @Override
    public void takeInQueue(Buyer actor) {
        allBuyersQueue.add(actor);
    }

    @Override
    public void takeOrders() {
        allBuyersQueue.peek().isMakeOrder();
    }

    @Override
    public void giveOrders() {
        allBuyersQueue.peek().isTakeOrder();
    }

    @Override
    public void releaseFromQueue() {
        allBuyersQueue.remove();
    }
}
