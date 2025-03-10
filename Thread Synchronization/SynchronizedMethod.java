class BankAccount {
    private int balance = 1000;
    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
class Customer extends Thread {
    BankAccount account;
    Customer(BankAccount account) {
        this.account = account;
    }
    public void run() {
        account.withdraw(500);
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Customer customer1 = new Customer(account);
        Customer customer2 = new Customer(account);
        customer1.start();
        customer2.start();
    }
}
