import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by student on 04.03.2015.
 */
public class Account {
    private int accountNumber;
    private double balance;


    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void credit(double amount) {
        if (amount>balance) {
            System.out.println("Произошёл овердрафт");
        }
        else {
            System.out.println(balance-amount);
        }

    }
    public void debit(double amount) {

    }

    public String toString() {
        return String.format("A/C по: %d Balance=%.2f",accountNumber, balance);
    }
}

