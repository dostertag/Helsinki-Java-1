import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        String reversed = reverse(text);
        return(text.equals(reversed));
    }
    
    public static String reverse(String text) {
        String temp = "";
        Integer inputLength = text.length() - 1;
        // Integer counter = 0;
        
        while (inputLength >= 0){
            temp += text.charAt(inputLength);
            inputLength--;
            
        }
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        return temp;
    }
    
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
