package br.dmoura.dhouse.java.revisao.lista;

import java.util.HashSet;
import java.util.Set;

public class MainSet {

    public static void main(String[] args) {
        Set<String> conjunto = new HashSet<>();
        conjunto.add("Oiieeh");
        conjunto.add("Tchauuuu");
        conjunto.add("Byyyyeeee");
        conjunto.add("Hiiiiiiii");

        for (String valor : conjunto) {
            System.out.println(valor);
        }

    }
}
