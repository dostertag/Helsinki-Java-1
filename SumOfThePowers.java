
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number:");
        int maxValue = Integer.parseInt(reader.nextLine());
        double tempTotal = 1;
        int realTotal = 0;
        int counter = 0;
        while (counter <= maxValue){
            realTotal += (int)Math.pow(2, counter);
            counter++;
        }
        System.out.println("The result is: " + realTotal);
    }
}
