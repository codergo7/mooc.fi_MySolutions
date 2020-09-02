/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Book {
    
    private String title;
    private int pages;
    private int publicationYeers;

    public Book(String title, int pages, int publicationYeers) {
        this.title = title;
        this.pages = pages;
        this.publicationYeers = publicationYeers;
    }

    public String getTitle() {
        return title;
    }
    
    

    public Book(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return this.title + ", " + pages + " pages, " + this.publicationYeers; //To change body of generated methods, choose Tools | Templates.
    }
   
    
    
    
    
}
