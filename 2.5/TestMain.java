public class TestMain {
    public static void main(String[] args) {

        Customer c1 = new Customer(117, "Gadtardi", 'm');
        System.out.println("id=" + c1.getID());
        System.out.println("name=" + c1.getName());
        System.out.println("gender=" + c1.getGender());
        System.out.println(c1);

        Account a1 = new Account(2117, c1, 1000);
        System.out.println("id=" + a1.getID());
        System.out.println("customer=" + a1.getCustomer());
        System.out.println("balance=" + a1.getBalance());
        System.out.println(a1);
        System.out.println("customer name=" + a1.getCustomerName());
        a1.deposit(1000);
        a1.withdraw(3000);
        a1.withdraw(500);
        System.out.println(a1);


    }
}
