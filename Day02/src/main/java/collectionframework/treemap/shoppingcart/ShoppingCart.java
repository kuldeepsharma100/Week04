package collectionframework.treemap.shoppingcart;

import java.util.*;

public class ShoppingCart {
    private Map<String, Double> productPrices = new HashMap<>(); // Product -> Price (Fast Lookup)
    private Map<String, Integer> cart = new LinkedHashMap<>(); // Product -> Quantity (Maintains Order)
    private TreeMap<Double, List<String>> sortedByPrice = new TreeMap<>(); // Sorted by Price

    // Add a product with its price
    public void addProduct(String product, double price) {
        productPrices.put(product, price);
    }

    // Add item to the cart
    public void addToCart(String product, int quantity) {
        if (!productPrices.containsKey(product)) {
            System.out.println("Product not found: " + product);
            return;
        }
        cart.put(product, cart.getOrDefault(product, 0) + quantity);

        // Maintain sorted price order
        sortedByPrice.computeIfAbsent(productPrices.get(product), k -> new ArrayList<>()).add(product);
    }

    // Display cart items in order of addition (LinkedHashMap)
    public void displayCartByOrder() {
        System.out.println("\nCart Items (Added Order):");
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " - Quantity: " + entry.getValue() + ", Price: $" + productPrices.get(entry.getKey()));
        }
    }

    // Display products sorted by price (TreeMap)
    public void displayCartByPrice() {
        System.out.println("\nCart Items (Sorted by Price):");
        for (Map.Entry<Double, List<String>> entry : sortedByPrice.entrySet()) {
            for (String product : entry.getValue()) {
                System.out.println(product + " - Price: $" + entry.getKey() + ", Quantity: " + cart.get(product));
            }
        }
    }

    // Calculate total price
    public double getTotalPrice() {
        double total = 0.0;
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            total += productPrices.get(entry.getKey()) * entry.getValue();
        }
        return total;
    }

}
