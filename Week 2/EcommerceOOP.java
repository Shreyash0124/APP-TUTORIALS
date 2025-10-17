class Order {
    private double price;

    public Order(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

public class EcommerceOOP {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(45.59),
            new Order(120.50),
            new Order(32.75),
            new Order(39.95)
        };
        
        double total = 0;
        for (Order order : orders) {
            total += order.getPrice();
        }
        
        System.out.println("Total order value : " + total);
    }
}
