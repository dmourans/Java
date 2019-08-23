package br.dmoura.dhouse.java.exercicioentregavel;

public abstract class Professor {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return codigoDeProfessor.equals(professor.codigoDeProfessor);
    }

}
