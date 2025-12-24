public class EWalletPayment extends Payment implements Refundable {
    public EWalletPayment(double amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println("Paying with E-Wallet: " + amount);
    }

    @Override
    public void refund() {
        System.out.println("Refunding " + amount + " to E-Wallet.");
    }
}
