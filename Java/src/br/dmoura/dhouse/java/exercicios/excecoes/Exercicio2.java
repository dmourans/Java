package br.dmoura.dhouse.java.exercicios.excecoes;

import java.util.ArrayList;

public class Exercicio2 {
    public static void main(String[] args) {
        try {
            ArrayList<String> animal = new ArrayList<>();
            animal.add("Pato");
            animal.add("Cão");
            animal.add("Gato");

            System.out.println(animal.get(5));
        } catch (IndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Ocorreu um erro :: " + e.getSuppressed());
            e.printStackTrace();

        }


    }
}
