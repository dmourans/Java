package br.dmoura.dhouse.java.revisao.excecoes;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        try {
            ArrayList<String> lista = new ArrayList<>();
            lista.add("Bola");
            lista.add("Gato");
            lista.add("Tenis");

            System.out.println(lista.get(2));

        }catch (Exception e){
            System.out.println("Ocorreu um erro :: " + e.getMessage());
            e.printStackTrace();
        }

    }

}
