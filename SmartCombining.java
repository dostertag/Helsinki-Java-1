import java.util.ArrayList;
import java.util.Collections;




public class SmartCombining {
    
    public static void smartCombine(ArrayList<Integer> first, ArrayList<Integer> second){
        
        for(Integer item: first){
            if(second.contains(item)){
                ;
            } else {
                second.add(item);
            }
            
        }
        for(Integer thisItem: second){
            if(first.contains(thisItem)){
                ;
            } else {
                first.add(thisItem);
            }
        }

    }
    /*
    public static boolean isInside(ArrayList<Integer> first, ArrayList<Integer> second){
        for (Integer item: first){
            if(second.contains(item)){
                return true;
            }
        }
        return false;
    }
    */
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        Collections.addAll(list1, 10, 11);

        Collections.addAll(list2, 5);

        // remove comment when method ready
        smartCombine(list1, list2);
        System.out.println(list1);
        System.out.println(list2);
    }

}
