package hw2.market.market;

import hw2.market.buyers.Buyer;

public interface QueueBehaviour {
    void takeInQueue(Buyer actor);
    void takeOrders();
    void giveOrders();
    void releaseFromQueue();
}
