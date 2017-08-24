
import static java.lang.Math.abs;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
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

}
