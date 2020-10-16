package info.thatngo.designpattern.command.challenge;


public class OrderHandler {

    public void invoke(OrderAction action) {
        action.act();
    }
}
