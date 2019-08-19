package br.dmoura.dhouse.java.exercicios.excecoes;

public class TesteCalculo {

    public static void main(String[] args) {

        try {
            CalculoMatematico novoCal = new CalculoMatematico();
            int conta = novoCal.divisao(500,4);
            System.out.println("O valor do resultado é :: " + conta);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }
}
