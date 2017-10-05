
public class BoundedCounter {
    // copy here the class BoundedCounter from last weeks assignment 78 
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

public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;
    
   
    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        // the counters that represent hours, minutes and seconds are created and set to have the correct initial values
        this.hours = new BoundedCounter(23);
        this.hours.setValue(hoursAtBeginning);
        this.minutes = new BoundedCounter(59);
        this.minutes.setValue(minutesAtBeginning);
        this.seconds = new BoundedCounter(59);
        this.seconds.setValue(secondsAtBeginning);
    }
    
    public void tick() {
        // Clock advances by one second
        this.seconds.next();
        if (this.seconds.getValue() == 0) {
            this.minutes.next();
        }
        if (this.minutes.getValue() == 0 && this.seconds.getValue() == 0) {
            this.hours.next();
        }
    }
    @Override
    public String toString() {
        // returns the string representation
        return this.hours.toString() + ":" + this.minutes.toString() + ":" + this.seconds.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock(23, 59, 50);

        int i = 0;
        while (i < 20) {
            System.out.println(clock);
            clock.tick();
            i++;
        }
    }
}
