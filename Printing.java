public class Printing {

    public static void printStars(int amount) {
        // 39.1
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times      
        int counter = 1;
        while (counter <= amount){
            System.out.print("*");
            counter++;
        }
        System.out.println();
        // System.out.println("\n");
    }

    public static void printSquare(int sideSize) {
        int counter = 1;
        while (counter <= sideSize){
            printStars(sideSize);
            counter++;
        }
        // 39.2
    }

    public static void printRectangle(int width, int height) {
        int maxHeight = 1;
        while (maxHeight <= height){
            printStars(width);
            maxHeight++;
        }
        // 39.3
    }

    public static void printTriangle(int size) {
        int counter = 1;
        while (counter <= size){
            printStars(counter);
            counter++;
        }
        // 39.4
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(3);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
