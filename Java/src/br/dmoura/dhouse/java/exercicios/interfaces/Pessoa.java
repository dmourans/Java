package br.dmoura.dhouse.java.exercicios.interfaces;

public class Pessoa extends Animal implements Saudavel, Brincavel{

    private String sexo;

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String novoSexo) {
        sexo = novoSexo;
    }

    public Pessoa(String novaRaca) {
        super(novaRaca);
    }

    @Override
    public void seDivertir() {

    }

    @Override
    public boolean animalSaudavel(String diagnostico) {
        return false;
    }

    @Override
    public int calculoIdadeAnimal(int idade) {
        return 0;
    }
}
