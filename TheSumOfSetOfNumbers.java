
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Until what?");
        int maxValue = Integer.parseInt(reader.nextLine());
        int counter = 1;
        int sum = 0;
        
        while (counter <= maxValue){
            sum += counter;
            System.out.println(sum);
            counter++;
        }

    }
}
