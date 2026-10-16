public class InventorySystem {
    public boolean checkIngredients(String drink, String topping) {
        if (drink == null || topping == null) {
            return false;
        }

        if (drink.equals("Brown Sugar Milk Tea") || drink.equals("Taro Milk Tea")) {
            if (topping.equals("Tapioca Pearls") || topping.equals("Pudding")) {
                System.out.println("Ingredients are available. ");
                return true;
            }
        }
        System.out.println("Drink or topping is not available.");
        return false;
    }
}
