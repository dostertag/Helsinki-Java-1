
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        int numberGuessed = 102;
        int numberAttempts = 0;
        while (numberGuessed != numberDrawn){
            System.out.println("Guess a number: ");
            numberGuessed = Integer.parseInt(reader.nextLine());
            if (numberGuessed == numberDrawn) {
                System.out.println("Congratulations, your guess is correct!");
            } else if (numberGuessed < numberDrawn){
                numberAttempts++;
                System.out.println("The number is greater, guesses made: " + numberAttempts);
            } else {
                numberAttempts++;
                System.out.println("The number is lesser, guesses made: " + numberAttempts);
            }
        }
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
