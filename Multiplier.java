
public class Main {

    public static void main(String[] args) {
        
        Multiplier threeMultiplier = new Multiplier(3);
        System.out.println(threeMultiplier.multiply(3));
        // This is an empty main method which you can use to test your class's functionality.
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kdost
 */
public class Multiplier {
    
    private int number;
    
    public Multiplier(int number) {
        this.number = number;
    }
    
    public int multiply(int otherNumber) {
        return(number * otherNumber);
    }
    
}
