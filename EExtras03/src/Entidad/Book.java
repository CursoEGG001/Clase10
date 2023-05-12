/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author pc
 */
public class Book {
    private String title;
    private String author;
    private int numCopies;

    @Override
    public String toString() {
        return java.text.MessageFormat.format(java.util.ResourceBundle.getBundle("Entidad/Bundle").getString("BOOK : " + "[{0}] , {1}, HAS {2}COPIES"), new Object[] {title, author, numCopies});
    }

    public Book() {
    }

    public Book(String title, String author, int numCopies) {
        this.title = title;
        this.author = author;
        this.numCopies = numCopies;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumCopies() {
        return numCopies;
    }

    public void setNumCopies(int numCopies) {
        this.numCopies = numCopies;
    }


}
