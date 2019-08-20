package br.dmoura.dhouse.java.exercicios.javacomobjetos.clientesecontas;

public class Conta {
    private int numeroDaConta;
    private int saldo;
    private Cliente titular;

    public Conta(int numeroDaConta, int saldo, Cliente titular) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public void deposito(int valorDoDeposito) {
        int saldoAtual = saldo;
        if (valorDoDeposito > 0) {
            saldoAtual = saldoAtual + valorDoDeposito;
            System.out.println("Deposito efetuado com sucesso. \n novo Saldo :: " + saldoAtual);
        } else {
            System.out.println("Deposito não efetuado por falta de dinheiro");
        }
    }

    public void saque(int valorDoSaque) {
        int saltoAtual = saldo;
        if (saltoAtual <= 0){
            System.out.println("você não possui saldo para saque amigo pobre");
        }else if (saltoAtual < valorDoSaque){
            System.out.println("Infelizmente você não possui o saldo sufuciente para esse saque colega pobre");
        } else {
            saltoAtual = saltoAtual - valorDoSaque;
            System.out.println("saque realizado com sucesso :: " + saltoAtual);
        }

    }

}
