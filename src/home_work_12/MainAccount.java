package home_work_12;

public class MainAccount {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.setCustomerName("John");
        account1.setCustomerEmailAddress("johnSmith@gmail.com");
        account1.setCustomerPhoneNumber("+38(066)1234567");
        account1.setNumber(10110);
        account1.deposit(100.51);
        account1.withdraw(101);
        System.out.println(account1.getCustomerName());
        System.out.println(account1.getCustomerPhoneNumber());
        System.out.println(account1.getCustomerEmailAddress());
        System.out.println(account1.getBalance());

        System.out.println("==================");

        Account account2 = new Account();
        account2.setCustomerName("Smith");
        account2.setNumber(12311);
        account2.deposit(100);
        account2.withdraw(50.25);
        System.out.println(account2.getCustomerName());
        System.out.println(account2.getNumber());
        System.out.println(account2.getBalance());
    }
}
