package collectionframework.treemap.shoppingcart;

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Adding products
        cart.addProduct("Apple", 1.5);
        cart.addProduct("Banana", 0.8);
        cart.addProduct("Orange", 1.2);

        // Adding items to the cart
        cart.addToCart("Apple", 3);
        cart.addToCart("Banana", 2);
        cart.addToCart("Orange", 4);

        // Display cart items
        cart.displayCartByOrder();
        cart.displayCartByPrice();

        // Display total price
        System.out.println("\nTotal Price: " + cart.getTotalPrice());
    }

}
