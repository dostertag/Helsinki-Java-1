public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int counter = 1;
        while (counter <= amount){
            System.out.print("*");
            counter++;
        }
        System.out.println();
    }

    public static void printWhitespaces(int amount) {
        int counter = 1;
        while (counter <= amount){
            System.out.print(" ");
            counter++;
        }
        // 40.1
    }

    public static void printTriangle(int size) {
        int counter = 1;
        int tempSize = size - 1;
        while (counter <= size){
            printWhitespaces(tempSize);
            printStars(counter);
            tempSize--;
            counter++;
        }
        
        // printWhitespaces(size - 1);
        // printStarts()
        // 40.2
    }

    public static void xmasTree(int height) {
        
        int counter = 1;
        int tempCounter = height - 1;
        int starCounter = 1;
        while (counter <= height){
            printWhitespaces(tempCounter);
            printStars(starCounter);
            tempCounter--;
            counter++;
            starCounter += 2;
        }
        printWhitespaces(height - 2);
        printStars(3);
        printWhitespaces(height - 2);
        printStars(3);
        // 40.3
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
