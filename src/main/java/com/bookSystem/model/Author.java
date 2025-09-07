package com.bookSystem.model;
public class Author{
    private final String name;
    private final String nationality;
    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }
    public Author(String name,String nationality){
        this.name = name;
        this.nationality = nationality;
    }
}