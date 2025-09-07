package com.bookSystem.model;
public class Book {
    private final String title;
    private final Author author;
    private final double price;
    private final int year;
    public Book(String title, Author author, double price, int year) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.year = year;
    }
    public double getPrice() {
        return price;
    }
    public Author getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
    public int getYear() {
        return year;
    }
    public String getInfo() {
        return "Title: "+title+"; Author: "+author+"; Price: "+this.price+"; Year: "+year;
    }
}
