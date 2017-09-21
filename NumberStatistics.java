
public class NumberStatistics {
    
    private int amountOfNumbers;
    private int sum;
//    private double average;
//    private int sumOfOdd;
//    private int sumOfEven;
    
    
    public NumberStatistics() {
        this.amountOfNumbers = 0;
        this.sum = 0;
        // this.average = 0;
    }
    
    public void addNumber(int number) {
        //if (number != -1) {
//            if (number % 2 == 0) {
//                this.sumOfEven += number;
//            } else {
//                this.sumOfOdd += number;
//            }
        this.sum += number;
        this.amountOfNumbers++;
        //} 
        
    }
    
    public int amountOfNumbers() {
        return this.amountOfNumbers;
    }
    
    public int sum() {
        
        return this.sum;
    }
    
    public double average() {
        // this.average = (this.sum / (double)this.amountOfNumbers);
        if (this.amountOfNumbers == 0) {
            return 0;
        } else {
            return ((double)this.sum / (double)this.amountOfNumbers);
        }
        
    }
    
    
    
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4

        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.

        // The tests does not work if you do not create the objects in the correct order
        NumberStatistics sumOfAllNumbers = new NumberStatistics();
        NumberStatistics sumOfAllEvens = new NumberStatistics();
        NumberStatistics sumOfAllOdds = new NumberStatistics();
        System.out.println("Type numbers ");
        int userInput = 0;
        while (userInput != -1) {
            //System.out.println("Type an integer: ");
            
            userInput = Integer.parseInt(reader.nextLine());
            if (userInput == -1) 
            {
                break;
            }
            if (userInput % 2 == 0) {
                sumOfAllEvens.addNumber(userInput);
                
            } else {
                sumOfAllOdds.addNumber(userInput);
                
            } 
            
            
            sumOfAllNumbers.addNumber(userInput);
            //System.out.println();
        }
        System.out.println("sum: " + sumOfAllNumbers.sum());
        System.out.println("sum of even: " + sumOfAllEvens.sum());
        System.out.println("sum of odd: " + sumOfAllOdds.sum());
        

        
    }
}
