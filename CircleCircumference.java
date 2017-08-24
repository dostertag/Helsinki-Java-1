
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the radius: ");
        float firstRadius = Integer.parseInt(reader.nextLine());
        
        double result = Math.PI * firstRadius * 2;
        System.out.println("Circumference of the circle: " + result);
        // Program your solution here 
    }
}
