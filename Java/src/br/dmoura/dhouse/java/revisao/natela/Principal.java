package br.dmoura.dhouse.java.revisao.natela;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner pegandoDados = new Scanner(System.in);

        System.out.println("Qual seu nome amigo: ");
        //pegando variavel string com .next()
        String nome = pegandoDados.next();
        System.out.println("Qual sua idade: ");
        //pegando variavel string com .nextInt()
        int idade = pegandoDados.nextInt();

        System.out.println("e ai pessoinha .:: " + nome);
        System.out.println("ta velho com  .:: " + idade + " hein?");
    }
}
