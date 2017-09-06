import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for(int item: list){
            sum += item;
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        int size = list.size();
        double average = (double)sum(list)/size;
        // System.out.println(average);
        return (double)average;
        
    }

    public static double variance(ArrayList<Integer> list) {
        double weirdValue = 0.0;
        int divisor = list.size() - 1;
        double tempAverage = average(list);
        for(double item: list){
            double temp = item - (double)tempAverage;
            weirdValue += temp * temp;
        }
        // write code here
        return weirdValue / (double)divisor;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        //list.add(7);
        //list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
