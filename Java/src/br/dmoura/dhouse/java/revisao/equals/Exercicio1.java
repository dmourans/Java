package br.dmoura.dhouse.java.revisao.equals;

public class Exercicio1 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("jão", 111);
        Pessoa pessoa2 = new Pessoa("jão", 111);

        System.out.println(pessoa1.equals(pessoa2));
    }
}
