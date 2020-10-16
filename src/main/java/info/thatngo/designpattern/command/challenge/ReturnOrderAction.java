package info.thatngo.designpattern.command.challenge;

public class ReturnOrderAction implements OrderAction {
    private Jacket jacket;

    public ReturnOrderAction(Jacket jacket) {
        this.jacket = jacket;
    }

    @Override
    public void act() {
        this.jacket.returnOrder();
    }
}
