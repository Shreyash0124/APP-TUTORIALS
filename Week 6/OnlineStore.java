class Customer {
    void getDiscount() {
        System.out.println("No discount for normal customers.");
    }
}

class RegularCustomer extends Customer {
    void getDiscount() {
        System.out.println("Regular Customer gets 5% discount.");
    }
}

class PremiumCustomer extends Customer {
    void getDiscount() {
        System.out.println("Premium Customer gets 10% discount.");
    }
}

public class OnlineStore {
    public static void main(String[] args) {
        Customer c1 = new RegularCustomer();
        c1.getDiscount();

        Customer c2 = new PremiumCustomer();
        c2.getDiscount();
    }
}

