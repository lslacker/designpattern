package info.thatngo.designpattern.command.challenge;

public class SalesOrderClient {

    private static Jacket jacket = new Jacket();


    public static void main(String[] args) {
        OrderHandler placeOrderHander = new OrderHandler();
        OrderHandler returnOrderHandler = new OrderHandler();


        placeOrderHander.invoke(new PlaceOrderAction(jacket));
        returnOrderHandler.invoke(new ReturnOrderAction(jacket));
    }
}
