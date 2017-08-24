

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        // write testcode here
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }
    
    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }
    
    public static int indexOfTheSmallest(int[] array) {
        int smallestIndex = 0;
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int smallestIndex = index;
        int smallest = array[index];
        for (int i = smallestIndex; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int valueOfOne = array[index1];
        int valueOfTwo = array[index2];
        array[index1] = valueOfTwo;
        array[index2] = valueOfOne;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            swap(array, indexOfTheSmallestStartingFrom(array, i), i);
            System.out.println(Arrays.toString(array));
        }
        
    }
}
