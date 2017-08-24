/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kdost
 */
public class Book {
    
    private String title;
    private String publisher;
    private int year;
    
    public Book(String title, String publisher, int year) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
    }
    
    public String title() {
        return this.title;
    }
    
    public String publisher() {
        return this.publisher;
    }
    
    public int year() {
        return this.year;
    }
    
    public String toString() {
        return this.title + ", " + this.publisher + ", " + this.year;
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
public class Library {
    
    private ArrayList<Book> bookList;
    
    public Library() {
        this.bookList = new ArrayList<Book>();
    }
    
    public void addBook(Book newBook) {
        this.bookList.add(newBook);
    }
    
    public void printBooks() {
        for (Book bk : this.bookList) {
            System.out.println(bk);
        }
    }
    
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();
        
        for (Book tl : this.bookList) {
            //if (tl.title().contains(title)) {
            if (StringUtils.included(tl.title(), title)) {
                found.add(tl);
            }
        }
        return found;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();
        
        for (Book tl : this.bookList) {
            //if (tl.publisher().contains(publisher)) {
            if (StringUtils.included(tl.publisher(), publisher)) {
                found.add(tl);
            }
        }
        return found;
    }
    
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();
        
        for (Book tl : this.bookList) {
            if (tl.year() == year) {
            
                found.add(tl);
            }
        }
        
        return found;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kdost
 */
public class StringUtils {
    
    public static boolean included(String word, String searched) {
        if (word.toUpperCase().trim().contains(searched.trim().toUpperCase())) {
            return true;
        }
        return false;
    }
    
    
    
}
