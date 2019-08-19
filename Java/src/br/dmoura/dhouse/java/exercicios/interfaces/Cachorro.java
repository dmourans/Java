package br.dmoura.dhouse.java.exercicios.interfaces;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class Cachorro extends Animal implements Saudavel {

    public Cachorro(String novaRaca) {
        super(novaRaca);
    }

    @Override
    public boolean animalSaudavel(String diagnostico) {
        if (diagnostico != null && !diagnostico.equals("")){
            System.out.println("Nome.: " + getRaca() + " O diagnostico é: " + diagnostico);
        } else {
            System.out.println("Não possui diagnostico");
        }

        return false;
    }

    @Override
    public int calculoIdadeAnimal(int novaIdade) {
        System.out.println("Somando as idades!");
        return getIdade() * novaIdade;
    }

    @Override
    public void seDivertir() {
        System.out.println("Sou feliz!");
    }
}
