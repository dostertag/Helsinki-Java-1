
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the points [0-60]");
        int firstGrade = Integer.parseInt(reader.nextLine());
        
        if (firstGrade <= 29) {
            System.out.println("Grade: Failed");
        } else if (firstGrade >= 30 && firstGrade <= 34) {
            System.out.println("Grade: 1");
        } else if (firstGrade > 34 && firstGrade <= 39) {
            System.out.println("Grade: 2");
        } else if (firstGrade > 39 && firstGrade <= 44) {
            System.out.println("Grade: 3");
        } else if (firstGrade > 44 && firstGrade <= 49) {
            System.out.println("Grade: 4");
        } else {
            System.out.println("Grade: 5");
        }
    }
}
