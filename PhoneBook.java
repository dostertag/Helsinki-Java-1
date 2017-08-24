/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kdost
 */
public class Person {
    
    private String name;
    private String number;
    
    public Person(String name, String number) {
        this.name = name;
        this.number = number;
        // System.out.println(this.name);
        // System.out.println(this.number);
    }
    
    public void changeNumber(String newNumber) {
        this.number = newNumber;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getNumber() {
        return this.number;
    }
    @Override
    public String toString() {
        return this.name + " number: " + this.number;
    }
        
}


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kdost
 */
public class Phonebook {
    
    private ArrayList<Person> phonebook;
    
    public Phonebook () {
        this.phonebook = new ArrayList<Person>();
        // Person person = new Person(name, number);
        // this.phonebook.add(person);
    }
    
    public void add(String name, String number) {
        Person person = new Person(name, number); 
        this.phonebook.add(person);
    }
    
    public void printAll() {
        for (Person prs : this.phonebook) {
            System.out.println(prs);
        }
    }
    
    public String searchNumber(String name) {
        for (Person prs : this.phonebook) {
            if (prs.getName().equals(name)) {
                return prs.getNumber();
            }
        }
        return "number not known";
    }
    
}
