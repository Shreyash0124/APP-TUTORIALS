// 3. Online Shopping Cart with Composition

import java.util.ArrayList;

class Product {
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void reduceStock(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
        }
    }

    public void addStock(int quantity) {
        stock += quantity;
    }
}

class CartItem {
    private Product product;
    private int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getItemTotal() {
        return product.getPrice() * quantity;
    }
}

class ShoppingCart {
    private ArrayList<CartItem> items = new ArrayList<>();

    public void addItem(Product product, int quantity) {
        if (product.getStock() >= quantity) {
            product.reduceStock(quantity);
            items.add(new CartItem(product, quantity));
            System.out.println(quantity + " " + product.getName() + "(s) added to cart.");
        } else {
            System.out.println("Not enough stock available for " + product.getName());
        }
    }

    public void removeItem(Product product) {
        CartItem toRemove = null;
        for (CartItem item : items) {
            if (item.getProduct().equals(product)) {
                toRemove = item;
                break;
            }
        }
        if (toRemove != null) {
            items.remove(toRemove);
            product.addStock(toRemove.getQuantity());
            System.out.println(toRemove.getQuantity() + " " + product.getName() + "(s) removed from cart.");
        } else {
            System.out.println("Product not found in cart.");
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getItemTotal();
        }
        // Example discount: 10% off if total > 1000
        if (total > 1000) {
            total *= 0.9;
        }
        return total;
    }
}

class User {
    private String name;
    private ShoppingCart cart;

    public User(String name) {
        this.name = name;
        this.cart = new ShoppingCart();
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public String getName() {
        return name;
    }
}

