
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kdost
 */
public class Birds {
    private String name;
    private String latinName;
    private int numObservations;
    
    public Birds(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.numObservations = 0;
    }
    
    public void addObservation() {
        this.numObservations++;
    }
    
    public void printBird() {
        System.out.println(this.name + " (" + this.latinName + ") : " + this.numObservations + "observations");
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getLatinName() {
        return this.latinName;
    }
    
    public int getObservations() {
        return this.numObservations;
    }
    

}


import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kdost
 */
public class BirdData {
    private ArrayList<Birds> dataBase;
    
    public BirdData () {
        this.dataBase = new ArrayList<Birds>();
    }
    
    public void add(Scanner reader) {
        String name = "";
        String latinName = "";
        System.out.print("Name: ");
        name = reader.nextLine();
        System.out.print("Latin name: ");
        latinName = reader.nextLine();     
        Birds newBird = new Birds(name, latinName);
        this.dataBase.add(newBird);
    }
    
    public void observe(Scanner reader) {
        String name = "";
        System.out.print("What was observed:? ");
        name = reader.nextLine();
        if (this.isABird(name)) {
            for (Birds bir : this.dataBase) {
                if (bir.getName().contains(name)) {
                    bir.addObservation();
                }
            }
        } else {
            System.out.println("Is not a bird!");
        }
    }
    
    public void show(Scanner reader) {
        String name;
        System.out.print("What? ");
        name = reader.nextLine();
        
        for (Birds bir : this.dataBase) {
            if (bir.getName().contains(name)) {
                bir.printBird();
            }
        }
    }
    
    public void showStatistics() {
        for (Birds bir : this.dataBase) {
            bir.printBird();
        }
    }
    
    private boolean isABird(String name) {
        for (Birds bir : this.dataBase) {
            if (bir.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
    
    
    

}
