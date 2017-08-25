
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Up to what number?");
        int maxNumber = Integer.parseInt(reader.nextLine());
        int counter = 1;
        
        while (counter <= maxNumber){
            System.out.println(counter);
            counter += 1;
        }
        
        // Write your code here
        
    }
}
