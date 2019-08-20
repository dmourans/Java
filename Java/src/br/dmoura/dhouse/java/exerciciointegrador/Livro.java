package br.dmoura.dhouse.java.exerciciointegrador;

public class Livro {
    private int codigo;
    private String titulo;
    private String autor;
    private int anoLancamento;
    private double isbn;
    private int quantidade;
    private double preco;

    public Livro(int codigo, String titulo, String autor, int anoLancamento, double isbn, int quantidade, double preco) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.anoLancamento = anoLancamento;
        this.isbn = isbn;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public double getIsbn() {
        return isbn;
    }

    public void setIsbn(double isbn) {
        this.isbn = isbn;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoLancamento=" + anoLancamento +
                ", isbn=" + isbn +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                '}';
    }

}
