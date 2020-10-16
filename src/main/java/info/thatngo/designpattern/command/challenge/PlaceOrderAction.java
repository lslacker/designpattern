package info.thatngo.designpattern.command.challenge;

public class PlaceOrderAction implements OrderAction {

    private Jacket jacket;

    public PlaceOrderAction(Jacket jacket) {
        this.jacket = jacket;
    }

    @Override
    public void act() {
        this.jacket.placeOrder();
    }
}
