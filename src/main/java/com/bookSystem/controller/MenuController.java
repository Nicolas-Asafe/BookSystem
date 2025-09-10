package com.bookSystem.controller;

import com.bookSystem.model.Author;
import com.bookSystem.service.BookService;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Supplier;

public class MenuController {
    private BookService bs = new BookService();
    private void CreateLayout(ArrayList<String> options, Supplier<String> typeNext) {
        System.out.println("========================");
        for (int i = 0; i < options.size(); i++) {
            System.out.println("  " + (i + 1) + " - " + options.get(i));
        }

        System.out.println("========================");
        typeNext.get();

    }

    public void InitialMenu() {
        ArrayList<String> options = new ArrayList<>();
        options.add("Create book");
        options.add("Find one book");
        options.add("List all books");
        CreateLayout(options, () -> {
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.print("Select one option: ");
                String res = sc.nextLine();
                try {
                    int num = Integer.parseInt(res);
                    if (num > 0 && num <= options.size()) {
                        SelectOptionsMenuInitial(num);
                        sc.close();
                        break;
                    }
                } catch (NumberFormatException e) {}
                System.out.println("Try again");
            }
            return null;
        });
    }
    public void SelectOptionsMenuInitial(int opNum){
        switch (opNum) {
            case 1:
                CreateBookOptionUI();
                break;
            default:
                throw new AssertionError();
        }
    }
    public void CreateBookOptionUI(){
        Scanner sc = new Scanner(System.in);

        System.out.println("===CREATE=BOOK===");
        System.out.print("Enter the title of book: ");
        String titleOfBook = sc.nextLine();
        System.out.print("Enter the price of book: ");
        int price = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the year of book: ");
        int year = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the name o author: ");
        String nameAuthor = sc.nextLine();
        System.out.print("Enter the nationality o author: ");
        String nationalityAuthor = sc.nextLine();

        Author author = new Author(nameAuthor,nationalityAuthor);
        bs.AddBook(titleOfBook, author, price, year);

        System.out.println("Book created successfully!");
        InitialMenu();
        sc.close();
    }
}
