
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        System.out.println("First");
        int firstValue = Integer.parseInt(reader.nextLine());
        System.out.println("Second");
        int maxValue = Integer.parseInt(reader.nextLine());
        
        while(firstValue <= maxValue){
            sum += firstValue;
            firstValue++;
        }
        System.out.println("The sum: " + sum);
    }
}
