/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kdost
 */
public class LyyraCard {
    
    private double balance;
    
    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }
    
    public String toString() {
        return "The card has " + this.balance + " euros";
    }
    
    public void payEconomical() {
        if ((this.balance - 2.50) >= 0) {
            this.balance -= 2.50;
        }
    }
    
    public void payGourmet() {
        if ((this.balance - 4.00) >= 0) {
            this.balance -= 4.00;
        }
    }
    
    public void loadMoney(double amount) {
        if (amount >= 0) {
            if ((this.balance + amount) <= 150.00) {
                this.balance += amount;
            } else {
                this.balance = 150.00;
            }
        }
    }
    
}


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // add here code that tests LyraCard. However before doing 77.6 remove the
        // other code 
        LyyraCard pekka = new LyyraCard(20);
        LyyraCard brian = new LyyraCard(30);
        
        pekka.payGourmet();
        brian.payEconomical();
        
        System.out.println("Pekka: "  + pekka.toString());
        System.out.println("Brian: " + brian.toString());
        
        pekka.loadMoney(20);
        brian.payGourmet();
        
        System.out.println("Pekka: " + pekka.toString());
        System.out.println("Brian: " + brian.toString());
        
        pekka.payEconomical();
        pekka.payEconomical();
        brian.loadMoney(50);
        
        System.out.println("Pekka: " + pekka.toString());
        System.out.println("Brian: " + brian.toString());

    }
}
