public class PaymentSystem {

    public boolean pay(double price) {
        System.out.println("Processing payment...");

        if (price > 0) {
            System.out.println("Payment successful: " + price + " KZT");
            return true;
        }

        System.out.println("Payment failed: Invalid price.");
        return false;
    }
}
