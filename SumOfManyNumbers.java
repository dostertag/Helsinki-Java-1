
import java.util.Scanner;


public class SumOfManyNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read;
        while(true){
            read = Integer.parseInt(reader.nextLine());
            if (read == 0){
                break;
            } else {
                sum += read;
            }
        }
        
        

            // do something here

        System.out.println("Sum: " + sum);
        
        
        // System.out.println("Sum in the end: " + sum);
    }
}
