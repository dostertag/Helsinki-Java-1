import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int tempNumber;
        int sumOfNumbers = 0;
        int counter = 0;
        int numberOfEvens = 0;
        int numberOfOdds = 0;
        while (true) {
            tempNumber = Integer.parseInt(reader.nextLine());
            if (tempNumber == -1){
                break;
            } else {
                sumOfNumbers+= tempNumber;
            }
            counter++;
            if (tempNumber % 2 == 0){
                numberOfEvens++;
            } else {
                numberOfOdds++;
            }
        }   
        float average = (float)sumOfNumbers / counter;
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is: " + sumOfNumbers);
        System.out.println("How many number: " + counter);
        System.out.println("Average: " + average);
        System.out.println("Number of evens: " + numberOfEvens);
        System.out.println("Number of Odds: " + numberOfOdds);
    }
}
