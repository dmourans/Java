package br.dmoura.dhouse.java.exercicioentregavel.parteC;

public class Professor {

    private String nome;
    private String sobreNome;
    private Integer tempoDeCasa;
    private Integer codigoDeProfessor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public Integer getTempoDeCasa() {
        return tempoDeCasa;
    }

    public void setTempoDeCasa(Integer tempoDeCasa) {
        this.tempoDeCasa = tempoDeCasa;
    }

    public Integer getCodigoDeProfessor() {
        return codigoDeProfessor;
    }

    public void setCodigoDeProfessor(Integer codigoDeProfessor) {
        this.codigoDeProfessor = codigoDeProfessor;
    }
}