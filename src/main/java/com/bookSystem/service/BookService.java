package com.bookSystem.service;

import com.bookSystem.model.Author;
import com.bookSystem.model.Book;
import java.util.ArrayList;
import java.util.List;

public class BookService{
    private List<Book> Books = new ArrayList<>();

    public void AddBook(String title,Author author,double price,int year){
        Book NewBook = new Book(title,author,price,year);
        this.Books.add(NewBook);
    }
    public List<Book> FindBooks(){
        return Books;
    }
    public Book FindOneBookByTitle(String title){
        String titleOfBookForFind = title;
        Book BookForFind = null;

        for (Book b : Books){
            if(b.getTitle().equals(titleOfBookForFind)){
                BookForFind = b;
            }
        }

        return BookForFind;
    }
}