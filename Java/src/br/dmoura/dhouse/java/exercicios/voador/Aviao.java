package br.dmoura.dhouse.java.exercicios.voador;

public class Aviao implements Voador {

    private int hora;

    public int getHoras() {
        return hora;
    }

    public void setHoras(int novaHora) {
        hora = novaHora;
    }

    public Aviao(int novaHora) {
        hora = novaHora;
    }

    @Override
    public void voar() {
        hora = getHoras() + 13;
        System.out.println("Estou voando como um Avião | " + hora + " ::");
    }
}
