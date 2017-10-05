import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random = new Random();

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    @SuppressWarnings("empty-statement")
    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        //Random random = new Random(39);
        int newRandomDraw;
        // Write the number drawing here using the method containsNumber()
        while(this.numbers.size() < 7) {
            newRandomDraw = this.random.nextInt(39) + 1;
            if(this.containsNumber(newRandomDraw)) {
                ;
            } else {
                this.numbers.add(newRandomDraw);
            }
            
        }
        
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        
        return this.numbers.contains(number);
    }
}
