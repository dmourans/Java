package br.dmoura.dhouse.java.exercicios.lista;

import java.util.HashMap;
import java.util.Map;

public class Exercicio1 {

    public static void main(String[] args) {
        Map<Integer, String> loteria = new HashMap<>();

        loteria.put(0, "Ovos");
        loteria.put(1, "Água");
        loteria.put(2, "Escopeta");
        loteria.put(3, "Cavalo");
        loteria.put(4, "Dentista");
        loteria.put(5, "Fogo");

        for (Integer chave : loteria.keySet()) {
            String valor = loteria.get(chave);
            System.out.println(chave + " :: " + valor);
        }

        Map<String, String> apelidos = new HashMap<>();

        apelidos.put("João", "Juan, Fissura, Maromba");
        apelidos.put("Miguel", "Night Watch, Bruce Wayne, Tampinha");
        apelidos.put("Maria", "Wonder Woman, Mary, Marilene");
        apelidos.put("Lucas", "Lukinha, Jorge, George");

        for (String chave : apelidos.keySet()) {
            String valor = apelidos.get(chave);
            System.out.println(chave + " :: " + valor);
        }


    }
}
