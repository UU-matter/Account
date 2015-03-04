/**
 * Created by student on 04.03.2015.
 */
public class TestAccount {

    public static void main(String[] args) {
        Account a1 = new Account(1000.00);
        Account a2 = new Account(3);
        Account a3 = new Account(5, 2000.00);

        System.out.println(a1.getBalance()+"  "+a1.getAccountNumber());
        System.out.println(a2.getBalance()+"  "+a2.getAccountNumber());
        System.out.println(a3.getBalance()+"  "+a3.getAccountNumber());

        a1.credit(1500);
        a2.credit(1000);
        a3.credit(1000);

        System.out.println(" ");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
