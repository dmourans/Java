package br.dmoura.dhouse.java.exercicios.bancosantander;

public abstract class Contas {

    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        System.out.println("Valor depositado" + valor);
        saldo += valor;
        System.out.println("Valor total na conta" + saldo);
    }

    public void sacar(double valor) {
        System.out.println("Informe o valor .:" + valor);
        if (valor > saldo) {
            System.out.println("Você não tem o saldo para esse saque amiguinho");
        } else {
            saldo -= valor;
        }
    }


}
