/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kdost
 */
public class Counter {
    
    private int counter;
    private boolean check;
    
    public Counter (int startingValue, boolean check) {
        this.counter = startingValue;
        this.check = check;
    }
    
    public Counter (int startingValue) {
        this(startingValue, false);
    }
    
    public Counter (boolean check) {
        this(0, check);
    }
    
    public Counter () {
        this(0, false);
    } 
    
    public int value() {
        return this.counter;
    }
    
    public void increase() {
        this.counter++;
    }
    
    public void increase(int increaseAmount) {
        if(increaseAmount > 0) {
            this.counter += increaseAmount;
        }
    }
    
    public void decrease() {
        if (this.check) {
            if (this.counter - 1 < 0) {
            } else {
                this.counter--;
            }
        } else {
            this.counter--;
        }
    }
    
    public void decrease(int decreaseAmount) {
        if(decreaseAmount > 0) {
            if (this.check) {
                if (this.counter - decreaseAmount >= 0) {
                    this.counter -= decreaseAmount;
                } else {
                    this.counter = 0;
                }
            } else {
                this.counter -= decreaseAmount;
            }
        }
    }

}
