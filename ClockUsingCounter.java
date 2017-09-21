/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kdost
 */
public class BoundedCounter {
    
    private int value;
    private int upperLimit;
    
    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
        this.value = 0;
    }
    
    public void next() {
        this.value++;
        if (this.value > this.upperLimit) {
            this.value = 0;
        }
    }
    
    public String toString() {
        if ( this.value < 10 ) {
            return "0" + this.value;
        }
        return "" + this.value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        if (value >= 0 && value <= this.upperLimit) {
            this.value = value;
        }

//        } else {
//            this.value = 0;
//        }
    }
}


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // write here code to ensure that BoundedCounter works as expected
        // before starting 78.3 remove the extra code and use the skeleton shown
        // in the assignment
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        System.out.print("seconds: ");
        int s =  Integer.parseInt(reader.nextLine());   // read the initial value of seconds from the user
        System.out.print("minutes: ");
        int m = Integer.parseInt(reader.nextLine()); // read the initial value of minutes from the user
        System.out.print("hours: ");
        int h = Integer.parseInt(reader.nextLine()); // read the initial value of hours from the user

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);

        int i = 0;
        while ( i < 121 ) {
            // like in previous but seconds taken into account
            System.out.println(hours.toString() + ":" + minutes.toString() + ":" + seconds.toString());

            seconds.next();
            if (seconds.getValue() == 0 ) {
                minutes.next();
            }
            if (minutes.getValue() == 0 && seconds.getValue() == 0 ) {
                hours.next();
            }
//            if (hours.getValue() == 0 && minutes.getValue() == 0 ) {
//                System.out.println(seconds.toString());
//            } else if ( hours.getValue() == 0 && minutes.getValue() > 0 ) {
//                System.out.println(minutes.toString() + ":" + seconds.toString());
//            } else {
//                System.out.println(hours.toString() + ":" + minutes.toString() + ":" + seconds.toString());
//            }
//            System.out.println(hours.toString() + ":" + minutes.toString());
//            minutes.next();
//            if (minutes.getValue() == 0 ) {
//                hours.next();
//            }
            i++;
        }

        
    }
}
