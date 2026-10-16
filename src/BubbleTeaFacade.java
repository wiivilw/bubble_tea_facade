public class BubbleTeaFacade {

    private InventorySystem inventory;
    private PaymentSystem payment;
    private TeaPreparation preparation;
    private PackingSystem packaging;

    public BubbleTeaFacade() {
        inventory = new InventorySystem();
        payment = new PaymentSystem();
        preparation = new TeaPreparation();
        packaging = new PackingSystem();
    }

    public void orderBubbleTea(String drink, String size, int sugar, String topping, double price) {

        System.out.println("-- Bubble Tea Order --");

        if (!inventory.checkIngredients(drink, topping)) {
            System.out.println("Order cancelled.");
            return;
        }
        if (!preparation.checkOrder(size, sugar)) {
            System.out.println("Order cancelled.");
            return;
        }
        if (!payment.pay(price)) {
            System.out.println("Order cancelled.");
            return;
        }

        preparation.prepareTea(drink, size, sugar, topping);
        packaging.packageTea();

        System.out.println("Thank you for your order!");
    }
}
