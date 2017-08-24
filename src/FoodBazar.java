public class FoodBazar {
    public static void main (String args[]){
        ShoppingCart cart = new ShoppingCart("Praveena");
        cart.add(new Apple(2.00));
        cart.add(new Orange(1.5));
        cart.add(new Banana(0.5));
        cart.add(new Kiwi(0.75));

        Checkout checkout = new Checkout(cart);
        checkout.printReciept();
    }
}
