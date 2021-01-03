package home_work_12;

public class Account {
    private int number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public void setNumber(int number) {
        this.number = number;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void deposit(double depositValue) {
        if (depositValue <0 ) {
            System.out.println("Сумма депозита не может быть меньше 0");
            return;
        }
        this.balance += depositValue;
    }

    public void withdraw(double withdrawValue) {
        if (this.balance < withdrawValue) {
            System.out.println("Недостаточно средств");
        } else {
            this.balance -= withdrawValue;
        }
    }
}
