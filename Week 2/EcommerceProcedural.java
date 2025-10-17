public class EcommerceProcedural {
    public static void main(String[] args) {
        double[] orderPrices = {45.59, 120.50, 327.5, 39.95};
        double total = 0;
        
        for (double price : orderPrices) {
            total += price;
        }
        
        System.out.println("Total order value : " + total);
    }
}
