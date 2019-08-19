package br.dmoura.dhouse.java.exercicios.interfaces;

public abstract class Animal implements Brincavel {

    private String raca;
    private int idade;
    private String nome;

    public Animal(String novaRaca) {
        raca = novaRaca;
    }

    public String getRaca() {
        return raca;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int novaIdade) {
        idade = novaIdade;
    }

    public void setNome(String novoNome) {
        nome = novoNome;
    }

    public void setRaca(String novaRaca) {
        raca = novaRaca;
    }
}
