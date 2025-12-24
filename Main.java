public class Main {
    public static void main(String[] args) {
        Payment[] payments = new Payment[3];
        payments[0] = new CashPayment(50000);
        payments[1] = new CreditCardPayment(150000);
        payments[2] = new EWalletPayment(80000);

        System.out.println("=== PAYMENT SYSTEM TEST ===");
        
        for (Payment p : payments) {
            System.out.println("---------------------------");
            p.printAmount();
            p.pay();

            if (p instanceof Refundable) {
                ((Refundable) p).refund();
            } else {
                System.out.println("(This payment method is not refundable)");
            }
        }
    }
}
