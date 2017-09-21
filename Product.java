/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kdost
 */
public class Product {
    private String name;
    private double price;
    private int amount;
    
    public Product(String name, double price, int amount){
        this.name = name;
        this.amount = amount;
        this.price = price;
    }
    
    public void printProduct(){
        System.out.println(this.name + ", price " + this.price + " amount " + this.amount);
    }
}


public class Main {
    public static void main(String[] args) {
        
        Product banana = new Product("Banana", 1.1, 13);
        
        banana.printProduct();
        // You can test your new class here, try e.g.:
        
        // Product t = new Product("Banana", 1.1, 13);
        // t.printProduct();
    }
}
