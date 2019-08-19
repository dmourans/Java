package br.dmoura.dhouse.java.exercicios.interfaces;

public class Principal {
    public static void main(String[] args) {

        Cachorro novoCachorro = new Cachorro( "Pintcher");
        novoCachorro.animalSaudavel( "Pelo Macio");

        novoCachorro.setIdade(7);
        int idadeAnimal = novoCachorro.calculoIdadeAnimal(7);
        System.out.println("O bichinho tem " + idadeAnimal + " anos em idade de cachorro");
    }
}
