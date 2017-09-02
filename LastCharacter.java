import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name:");
        String userInput = reader.nextLine();
        System.out.println("Last character: " + lastCharacter(userInput));
        
    }
    
    public static char lastCharacter(String text){
        int lastIndex = text.length() - 1;
        return(text.charAt(lastIndex));
    }
}
