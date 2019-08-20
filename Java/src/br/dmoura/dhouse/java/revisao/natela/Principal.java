package br.dmoura.dhouse.java.revisao.natela;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner pegandoNome = new Scanner(System.in);

        System.out.println("Qual seu nome amigo: ");
        String nome = pegandoNome.next();

        System.out.println("e ai pessoinha .:: " + nome);
    }
}
