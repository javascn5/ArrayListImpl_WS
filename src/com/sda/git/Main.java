package com.sda.git;

public class Main {

    public static void main(String[] args) {

        CustomList<String> lista = new CustomList<>();

        lista.add("Jan");
        lista.add("Maciej");
        lista.add("Jacek");
        lista.add("Anka");
        lista.add("Hanka");
        lista.add("Jozek");
        lista.add("Bartek");
        lista.add("Piotr");
        lista.add("Janusz");
        lista.add("Andrzej");
        lista.add("Bogus");
        lista.add("Arek");

        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }


    }
}
