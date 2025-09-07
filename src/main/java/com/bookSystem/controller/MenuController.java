package com.bookSystem.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Supplier;

public class MenuController {

    private final Scanner scanner = new Scanner(System.in);

    private String CreateLayout(ArrayList<String> options, Supplier<String> typeNext) {
        System.out.println("========================");
        List<Integer> opns = new ArrayList<>();

        for (int i = 0; i < options.size(); i++) {
            opns.add(i + 1); // adiciona índice válido
            System.out.println("  " + (i + 1) + " - " + options.get(i));
        }

        System.out.println("========================");

        // converte lista pra array de int
        int[] opnsArray = opns.stream().mapToInt(Integer::intValue).toArray();

        String response = CurrentResponse(opnsArray, typeNext);
        return response;
    }

    private String CurrentResponse(int[] optionsNum, Supplier<String> typeNext) {
        String response = typeNext.get();

        for (int opn : optionsNum) {
            if (response.equals(String.valueOf(opn))) {
                return response; // achou resposta válida
            }
        }

        return null; // se não bater com nenhuma opção
    }

    public void InitialMenu() {
        ArrayList<String> options = new ArrayList<>();
        options.add("Create book");
        options.add("Find one book");
        options.add("List all books");
        String response = CreateLayout(options, () -> {
            Scanner sc = new Scanner(System.in);
            System.out.print("Select one option: ");
            return sc.nextLine();
        });
    }
}
