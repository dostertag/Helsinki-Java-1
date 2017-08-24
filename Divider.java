
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number:");
        float firstNumber = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number:");
        float secondNumber = Integer.parseInt(reader.nextLine());
        float result = firstNumber / secondNumber;
        System.out.println("Division: " + firstNumber + " / " + secondNumber + " = " + result);
        

        // Implement your program here. Remember to ask the input from user.
    }
}
