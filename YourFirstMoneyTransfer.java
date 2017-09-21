
public class Accounts {

    public static void main(String[] args) {
        Account mattsAccount = new Account("Matt's account", 1000.00);
        Account myAccount = new Account("My account", 0.00);
        mattsAccount.withdrawal(100.00);
        myAccount.deposit(100.00);
        System.out.println(mattsAccount);
        System.out.println(myAccount);
        // Code in Account.Java should not be touched!
        // write your code here
    }

}

/* 
 * Do not touch this!
 */

public class Account {

    private double balance;
    private String owner;

    public Account(String owner, double balance) {
        this.balance = balance;
        this.owner = owner;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdrawal(double amount) {
        balance -= amount;
    }

    public double balance() {
        return balance;
    }

    @Override
    public String toString() {
        return owner + " balance: " + balance;
    }
}
