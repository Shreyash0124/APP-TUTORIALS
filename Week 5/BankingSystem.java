abstract class Account {
    String accountNumber;
    String holderName;
    double balance;

    abstract void calculateInterest();
}

class SavingsAccount extends Account {
    void calculateInterest() {
        System.out.println("Savings Account Interest: " + (balance * 0.04));
    }
}

class CurrentAccount extends Account {
    void calculateInterest() {
        System.out.println("Current Account Interest: " + (balance * 0.02));
    }
}

class LoanAccount extends Account {
    void calculateInterest() {
        System.out.println("Loan Interest: " + (balance * 0.08));
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.balance = 50000;
        sa.calculateInterest();

        CurrentAccount ca = new CurrentAccount();
        ca.balance = 80000;
        ca.calculateInterest();

        LoanAccount la = new LoanAccount();
        la.balance = 200000;
        la.calculateInterest();
    }
}

