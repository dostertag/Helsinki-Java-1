
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First:");
        int firstValue = Integer.parseInt(reader.nextLine());
        System.out.println("Last:");
        int lastValue = Integer.parseInt(reader.nextLine());
        
        while (firstValue <= lastValue){
            
            System.out.println(firstValue);
            ++firstValue;
        }

        // write your code here

    }
}
