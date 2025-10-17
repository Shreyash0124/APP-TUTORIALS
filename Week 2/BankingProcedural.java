public class BankingProcedural {
    public static void main(String[] args) {
        double[] balances = {1500.50, 2300.45, 1800.20, 3200.90};
        double total = 0;
        
        for (double balance : balances) {
            total += balance;
        }
        
        System.out.println("Total Balance : " + total);
    }
}

