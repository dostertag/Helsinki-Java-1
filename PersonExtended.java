import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
        
        System.out.println(this.birthday);
    }
    
    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
        
    }
    
    public Person(String name) {
        this.name = name;
        this.birthday = new MyDate(Calendar.getInstance().get(Calendar.DATE),
                                    Calendar.getInstance().get(Calendar.MONTH) + 1,
                                    Calendar.getInstance().get(Calendar.YEAR));
                                    
    }
    
    public int age() {
// calculate the age based on the birthday and the current day
        // you get the current day as follows: 
        int today = Calendar.getInstance().get(Calendar.DATE);
        int thisMonth = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        int thisYear = Calendar.getInstance().get(Calendar.YEAR);
        
        MyDate todaysDate = new MyDate(today, thisMonth, thisYear);
        
        
        
        return todaysDate.differenceInYears(this.birthday);
    }
    
    public boolean olderThan(Person compared) {
        // compare the ages based on birthdays
        
        
        return this.birthday.earlier(compared.birthday);
        
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
    

}


public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }
    
    

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public int differenceInYears(MyDate comparedDate) {
        // int temp = abs(this.month - comparedDate.month);
        if (this.earlier(comparedDate)) {
            if (comparedDate.month >= this.month && comparedDate.day >= this.day) {
                return comparedDate.year - this.year;
            } else {
                return comparedDate.year - this.year - 1;
            }
        } else {
            if (this.month >= comparedDate.month && this.day >= comparedDate.day) {
                return this.year - comparedDate.year;
            } else {
                return this.year - comparedDate.year - 1;
            }
        }
        
        //return this.year - comparedDate.year;
        // first.year - second.year OR first.year - second.year - 1
    }    

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
    /*
    public int differneceInYears(MyDate compared) {
        return -99;
    }
*/  
  
}
