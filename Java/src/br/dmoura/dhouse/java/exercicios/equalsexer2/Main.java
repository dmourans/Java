package br.dmoura.dhouse.java.exercicios.equalsexer2;

public class Main {
    public static void main(String[] args) {
        Coca comAcucar = new Coca(2,2.50);
        Coca semAcucar = new Coca(2,3.00);

        System.out.println(comAcucar.equals(semAcucar));
    }
}
