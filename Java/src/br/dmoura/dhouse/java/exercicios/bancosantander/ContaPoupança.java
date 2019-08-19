package br.dmoura.dhouse.java.exercicios.bancosantander;

public class ContaPoupança extends Contas{
    private double taxa;

    public void recolheJuros() {
        this.setSaldo(getSaldo() + (taxa/100));
        System.out.println("Saldo Atualizado");
    }


}
