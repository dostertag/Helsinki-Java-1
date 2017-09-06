
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> userData = new ArrayList<String>();
        String temp = " ";
        
        // create here an ArrayList
        while(temp.length() > 0){
            System.out.println("Type a word: ");
            temp = reader.nextLine();
            userData.add(temp);
        }
        Collections.sort(userData);
        for (String item: userData){
            System.out.println(item);
        }
    }
}
