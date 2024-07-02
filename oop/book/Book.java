package oop.book;

public class Book {
    private String name;
    private Author author;
    private int year;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        System.out.println("Name of the book: " + this.name + "," +
                " author: " + this.author.getName() + "(gender: " + this.author.getGender() +
                ", email: " + this.author.getEmail() + "), year: " + this.year);
        return "";
    }

    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }
}
