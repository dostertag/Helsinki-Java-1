import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String userInput = reader.nextLine();
        int counter = 1;
        if (userInput.length() > 3) {
            while (counter <= 3){
                System.out.println(counter + ". character: " + userInput.charAt(counter - 1));
                counter++;
            }
        }
        
    }
}
