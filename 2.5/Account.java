public class Account {
    
    private int id;
    private Customer customer;
    private double balance = 0.0;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getID() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return customer.getName() + "(" + id + ")" + " balance=$" + balance;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public Account deposit(double amount) {
        double newAmount = balance + amount;
        this.balance = newAmount;
        return this;
    }

    public Account withdraw(double amount) {
        if (balance >= amount) {
            double newAmount = balance - amount;
        this.balance = newAmount;
        }
        else {
            System.out.println("amount withdrawn exceeds current balance!");
        }
        return this;
    }

}
