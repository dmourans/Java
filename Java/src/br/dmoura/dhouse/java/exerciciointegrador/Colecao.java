package br.dmoura.dhouse.java.exerciciointegrador;

import java.util.ArrayList;
import java.util.List;

public class Colecao {
    private List<Livro> listaColecao = new ArrayList<>();
    private int codigo;
    private double preco;
    private String descricao;

    public Colecao(List<Livro> listaColecao, int codigo, double preco, String descricao) {
        this.listaColecao = listaColecao;
        this.codigo = codigo;
        this.preco = preco;
        this.descricao = descricao;
    }

    public List<Livro> getListaColecao() {
        return listaColecao;
    }

    public void setListaColecao(List<Livro> listaColecao) {
        this.listaColecao = listaColecao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
