
import static java.lang.Math.abs;


public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money added) {
        int tempEuros = this.euros + added.euros;
        int tempCents = this.cents + added.cents;
        Money addedMoney = new Money(tempEuros, tempCents);
        return addedMoney;
    }
    
    public boolean less(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        }
        return false;
    }
    
    public Money minus(Money decrimented) {
        
        int tempEuros;
        int tempCents;
        // Money returnedMoney;
        
        if (this.less(decrimented)) {
            //returnedMoney = new Money(0, 0);
            tempEuros = 0;
            tempCents = 0;
            
        } else if (this.euros >= decrimented.euros && this.cents < decrimented.cents) {
            tempEuros = this.euros - decrimented.euros - 1;
            tempCents = (this.cents + 100) - decrimented.cents;
            // tempCents = abs(this.cents - decrimented.cents);
            //returnedMoney = new Money(tempEuros, tempCents);
        
        } else {
            tempEuros = this.euros - decrimented.euros;
            tempCents = this.cents - decrimented.cents;
            //returnedMoney = new Money(tempEuros, tempCents);
        }
        Money otherMoney = new Money(tempEuros, tempCents);
        
        
        
        return otherMoney;
    }

}
