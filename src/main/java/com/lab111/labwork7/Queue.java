package com.lab111.labwork7;

import java.util.ArrayList;
import java.util.List;

/**
 * Class is created which acts as an invoker object.
 *
 * @author Roma Bondarenko
 */
public class Queue {
    private final List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void execOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}