class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

public class BankingOOP {
    public static void main(String[] args) {
        Account[] accounts = {
            new Account(1500.50),
            new Account(2300.45),
            new Account(1800.20),
            new Account(3200.90)
        };
        
        double total = 0;
        for (Account acc : accounts) {
            total += acc.getBalance();
        }
        
        System.out.println("Total balance : " + total);
    }
}

