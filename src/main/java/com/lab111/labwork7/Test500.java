package com.lab111.labwork7;

/**
 * Class for testing labwork7; command pattern was applied.
 *
 * @author Roma Bondarenko
 */
public class Test500 {
    public static void main(String[] args) {
        Request request = new Request("myRequest");
        ExclusionRequest exR = new ExclusionRequest(request);
        ChangeRequestPriority chR = new ChangeRequestPriority(request);
        Queue queue = new Queue();
        queue.takeOrder(exR);
        queue.takeOrder(chR);
        queue.execOrders();
    }
}