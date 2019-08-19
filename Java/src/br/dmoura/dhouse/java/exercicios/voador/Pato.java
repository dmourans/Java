package br.dmoura.dhouse.java.exercicios.voador;

public class Pato implements Voador {

    private int energia;

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int NovaEnergia) {
        energia = NovaEnergia;
    }

    public Pato(int novaEnergia) {
        energia = novaEnergia;
    }

    @Override
    public void voar() {
        energia = getEnergia() - 5;
        System.out.println("Estou voando como um pato | " + energia + " :: ");
    }
}
