package com.bookSystem.model;
public class Book {
    private String title;
    private Author author;
    private double price;
    private int year;
    public Book(String title, Author author, double price, int year) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.year = year;
    }
    public double getPrice() {
        return this.price;
    }
    public Author getAuthor() {
        return this.author;
    }
    public String getTitle() {
        return this.title;
    }
    public int getYear() {
        return this.year;
    }
    public String getInfo() {
        return "Title: "+this.title+"; Author: "+this.author+"; Price: "+this.price+"; Year: "+this.year;
    }
}
