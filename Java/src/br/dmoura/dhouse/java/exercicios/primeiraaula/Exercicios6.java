package br.dmoura.dhouse.java.exercicios.primeiraaula;

import java.util.ArrayList;
import java.util.List;

public class Exercicios6 {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) % 2 == 0) {
                result.add(numeros.get(i));
            }
        }

            System.out.println(result);
    }


}
