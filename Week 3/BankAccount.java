class BankAccount {
    String accountNumber;
    String accountHolder;
    double balance;

    void displayBalance() {
        System.out.println(accountHolder + " (Acc: " + accountNumber + ") - Balance: ₹" + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.accountNumber = "123456789";
        acc.accountHolder = "Akshar Madan";
        acc.balance = 15000.75;

        acc.displayBalance();
    }
}

