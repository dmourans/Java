package br.dmoura.dhouse.java.exercicios.voador;

public class SuperHomen implements Voador {

    private int experiencia;
    private int total;

    public int getExperiencia() {
        return experiencia;
    }

    public int getTotal() {
        return total;
    }

    public void setExperiencia(int novaExperiencia) {
        experiencia = novaExperiencia;
    }

    public void setTotal(int novoTotal) {
        total = novoTotal;
    }

    public SuperHomen(int novaExperiencia) {
        experiencia = novaExperiencia;
    }

    @Override
    public void voar() {
        experiencia = getExperiencia() + 3;
        System.out.println("Estou voando como um campeão | " + experiencia +" ::");
    }
}
