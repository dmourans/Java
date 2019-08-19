package br.dmoura.dhouse.java.exercicios.equalsexer2;

import java.util.Objects;

public class Coca {

    private Integer tamanho;
    private double preco;

    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Coca(Integer tamanho, double preco) {
        this.tamanho = tamanho;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object outraCoca) {
//        if (this == outraCoca) {
//            return true;
//        }
//        if (!(outraCoca instanceof Coca)) {
//            return false;
//        }
//        return this.tamanho ==  ((Coca) outraCoca).tamanho;

        return Objects.equals(tamanho, ((Coca) outraCoca).tamanho);

    }
}
