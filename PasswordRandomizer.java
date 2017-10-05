import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    //private Random random;
    private String newPassword;
    private int numberCharacters;
    

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.newPassword = "";
        this.numberCharacters = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        String temp = "";
        String symbol = "abcdefghijklmnopqrstuvwxyz";
        Random random = new Random();

        for(int i = 0; i < this.numberCharacters; i++) {
            temp += symbol.charAt(random.nextInt(symbol.length()));
        }
        this.newPassword = temp;
        return this.newPassword;
    }
}
