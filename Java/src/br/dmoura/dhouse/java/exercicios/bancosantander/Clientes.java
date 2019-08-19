package br.dmoura.dhouse.java.exercicios.bancosantander;

import javax.crypto.spec.PSource;

public class Clientes {
    private int iD;
    private String sobrenome;
    private int rg;
    private int cpf;
    private double saldo;

    public int getiD() {
        return iD;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public int getRg() {
        return rg;
    }

    public int getCpf() {
        return cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
