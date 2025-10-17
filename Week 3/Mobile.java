class Mobile {
    String brand, model;
    double price;

    void showDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: " + price);
    }

    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.brand = "Apple"; m1.model = "iPhone 15"; m1.price = 120000;

        Mobile m2 = new Mobile();
        m2.brand = "Samsung"; m2.model = "S24"; m2.price = 90000;

        Mobile m3 = new Mobile();
        m3.brand = "OnePlus"; m3.model = "12R"; m3.price = 50000;

        m1.showDetails();
        m2.showDetails();
        m3.showDetails();
    }
}
