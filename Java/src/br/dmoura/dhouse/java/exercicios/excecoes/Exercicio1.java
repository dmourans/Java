package br.dmoura.dhouse.java.exercicios.excecoes;

import java.util.ArrayList;

public class Exercicio1 {

    public static void main(String[] args) {

        try {
            ArrayList<String> animais = new ArrayList<>();
            animais.add("Pato");
            animais.add("Cachorro");
            animais.add("Gato");

            System.out.println(animais.get(6));

        } catch (Exception e) {
            System.out.println("Ocorreu um erro :: " + e.getSuppressed());
            e.printStackTrace();
        }

    }
}
