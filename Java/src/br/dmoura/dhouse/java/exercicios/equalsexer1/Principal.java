package br.dmoura.dhouse.java.exercicios.equalsexer1;

public class Principal {

    public static void main(String[] args) {

        Pessoa primeiraPessoa = new Pessoa("Luiz Daniel", 12345678);
        Pessoa segundaPessoa = new Pessoa("Nina Lofrese", 12345678);

        System.out.println(primeiraPessoa.equals(segundaPessoa));

    }

}
