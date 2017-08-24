
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        float firstNumber = Float.parseFloat(reader.nextLine());
        System.out.println("Type another number: ");
        float secondNumber = Float.parseFloat(reader.nextLine());
        
        float biggest = Math.max(firstNumber, secondNumber);
        System.out.println("The bigger number of the two numbers given was: " + biggest);
        // Implement your program here. Remember to ask the input from user
    }
}
