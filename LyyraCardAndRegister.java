
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        // at start the register has 1000 euros 
        this.cashInRegister = 1000;
        this.economicalSold = 0;
        this.gourmetSold = 0;
        
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens 
        if (cashGiven >= 2.50) {
            this.economicalSold++;
            this.cashInRegister += 2.50;
            return cashGiven - 2.50;
        }
        return cashGiven;
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        if (cashGiven >= 4.00) {
            this.gourmetSold++;
            this.cashInRegister += 4.00;
            return cashGiven - 4.00;
        }
        return cashGiven; 
    }
    
    public boolean payEconomical(LyyraCard card) {
        if (card.pay(2.50)) {
            this.economicalSold++;
            return true;
        } 
        return false;
    }
    
    public boolean payGourmet(LyyraCard card) {
        if (card.pay(4.00)) {
            this.gourmetSold++;
            return true;
        }
        return false;
    }
    
    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0) {
            this.cashInRegister += sum;
            card.loadMoney(sum);
        }
    }

    @Override
    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}


public class LyyraCard {

    private double balance;

    public LyyraCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void loadMoney(double amount) {
        this.balance += amount;
    }

    public boolean pay(double amount) {
       // method checks if the balance of the card is at least amount given as parameter
       // if not, methods returns false meaning that the card could not be used for the payment
       // if the balance is enough, the given amount is taken from the balance and true is returned
       if (this.balance - amount >= 0) {
           this.balance -= amount;
           return true;
       } else {
           return false;
       }

    }
}


public class Main {

    public static void main(String[] args) {
        // write test code here
        CashRegister unicafeExactum = new CashRegister();

        double theChange = unicafeExactum.payEconomical(10);
        System.out.println("the change was " + theChange );

        LyyraCard cardOfJim = new LyyraCard(7);

        boolean succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);
        succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);
        succeeded = unicafeExactum.payEconomical(cardOfJim);
        System.out.println("payment success: " + succeeded);

        System.out.println( unicafeExactum );
    }
}

