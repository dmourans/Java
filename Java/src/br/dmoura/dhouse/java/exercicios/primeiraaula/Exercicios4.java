package br.dmoura.dhouse.java.exercicios.primeiraaula;

import java.util.ArrayList;
import java.util.List;

public class Exercicios4 {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(4);
        numeros.add(5);
        numeros.add(55);
        numeros.add(45);
        numeros.add(1);

        int total = 0;

        for (int i = 0; i < numeros.size(); i++) {
            total = total + numeros.get(i);
        }
        System.out.println("A soma dos elementos é:" + total);

        //Teste
    }
}
