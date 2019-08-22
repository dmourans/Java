package br.dmoura.dhouse.java.exercicioentregavel.parteA;

public class Aluno {

    private String nome;
    private String sobrenome;
    private Integer codigo;

    public Aluno(String nome, String sobrenome, Integer codigo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
}
