public class TeaPreparation {

    public boolean checkOrder(String size, int sugar) {
        if (size == null ) {
            System.out.println("Invalid drink size.");
            return false;
        }
        if (!size.equals("Regular") && !size.equals("Large")) {
            System.out.println("Invalid drink size.");
            return false;
        }
        if (sugar <= 0 || sugar > 100) {
            System.out.println("Invalid sugar level.");
            return false;
        }
        return true;
    }

    public void prepareTea(String drink, String size, int sugar, String topping) {
        System.out.println("Preparing bubble tea...");
        System.out.println("Drink: " + drink);
        System.out.println("Size: " + size);
        System.out.println("Sugar: " + sugar + "%");
        System.out.println("Topping: " + topping);
        System.out.println("Bubble tea is ready.");
    }
}
