import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number:");
        int maxValue = Integer.parseInt(reader.nextLine());
        int counter = 1;
        int total = 1;
        while (counter <= maxValue) {
            total *= counter;
            counter++;
        }
        System.out.println("Factorial is: " + total);
    }
}
