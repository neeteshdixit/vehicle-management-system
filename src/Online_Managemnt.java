import java.util.ArrayList;

interface Payment {
    void pay(double amount);
    void deposit(double amount);
}

class UPI implements Payment{
    private String upiId;
    private double balance;
    private long accountNumber;
    final String BANK_NAME = "SBI";
    static int payments = 0;
    public String getUpiId() {
        return upiId;
    }

    public void setUpiId(String upiId) {
        this.upiId = upiId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    //constructor
    public UPI(String upiId, double balance, long accountNumber) {
        this.upiId=upiId;
        this.balance=balance;
        this.accountNumber=accountNumber;
    }

    @Override
    public void pay(double amount){
        if(accountNumber == accountNumber) {
            if (upiId == upiId) {
                if (balance >= amount) {
                    balance -= amount;
                    System.out.println("Payment of " + amount + " successful. Remaining balance: " + balance + " by this " + getUpiId());
                    payments++;
                } else {
                    System.out.println("Insufficient balance. Payment failed.");
                }
            }
            else{
                System.out.println("Invalid UPI ID. Payment failed.");
            }
        }
        else{
            System.out.println("Invalid account number. Payment failed.");

        }
    }


    @Override
    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposit of " + amount + " successful. Current balance: " + balance+" by this" + getUpiId());
    }
}

class Paypal implements Payment{
    private String email;
    private double balance;
    final String COMPANY_NAME = "Paypal";
    static int payments = 0;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //constructor
    public Paypal(String email, double balance) {
        this.email=email;
        this.balance=balance;
    }

    @Override
    public void pay(double amount){
        if(email == email) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Payment of " + amount + " successful. Remaining balance: " + balance + " by this " + getEmail());
                payments++;
            } else {
                System.out.println("Insufficient balance. Payment failed.");
            }
        }
        else{
            System.out.println("Invalid email. Payment failed.");
        }
    }

    @Override
    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposit of " + amount + " successful. Current balance: " + balance+" by this" + getEmail());
    }
}

public class Online_Managemnt {
    public static void main(String[] args) {
        ArrayList<Payment> paymentsList = new ArrayList<>();
        paymentsList.add(new UPI("neetesh@123", 1000.0, 1234567890L));
        paymentsList.add(new Paypal("dixitneetesh@gmail.com",1000.0));
        for(Payment payment : paymentsList){
            payment.pay(200.0);
            payment.deposit(100.0);
        }
    }
}