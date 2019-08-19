package br.dmoura.dhouse.java.exercicios.equalsexer3;

public class Aluno {
    private String nome;
    private Integer numeroAluno;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumeroAluno() {
        return numeroAluno;
    }

    public void setNumeroAluno(Integer numeroAluno) {
        this.numeroAluno = numeroAluno;
    }

    public Aluno(String nome, Integer numeroAluno) {
        this.nome = nome;
        this.numeroAluno = numeroAluno;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
