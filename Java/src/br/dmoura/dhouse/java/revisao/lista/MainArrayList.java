package br.dmoura.dhouse.java.revisao.lista;

import java.util.ArrayList;
import java.util.List;

public class MainArrayList {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("One Punch");
        lista.add("Attack on Titan");
        lista.add("Ferrari");
        lista.add("Michael Jordan");
        lista.add("John Stockton");
        lista.add("Kareen Abduul Jabar");
        lista.add("Romario");
        lista.add("Zinedine Zidane");

        for (String pessoa :lista){
            System.out.println(pessoa);
        }

//        String uauuu = lista.get(0);
//        System.out.println(uauuu + " ::Aauuuuii ::");
    }
}
