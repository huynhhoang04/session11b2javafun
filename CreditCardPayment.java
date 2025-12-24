public class CreditCardPayment extends Payment implements Refundable {
    public CreditCardPayment(double amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println("Paying with Credit Card: " + amount);
    }

    @Override
    public void refund() {
        System.out.println("Refunding " + amount + " to Credit Card.");
    }
}
