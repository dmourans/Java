package br.dmoura.dhouse.java.exercicioentregavel;

public class ProfessorTitular extends Professor {

    private String especialidade;

    public ProfessorTitular(String nome, String sobreNome, Integer codigoDeProfessor, String especialidade) {
        super(nome, sobreNome, codigoDeProfessor);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
