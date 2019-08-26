package br.dmoura.dhouse.java.exercicioentregavel;

public class ProfessorAdjunto extends Professor {

    private Integer qtdDeHrs;

    public ProfessorAdjunto(String nome, String sobreNome, Integer codigoDeProfessor, Integer qtdDeHrs) {
        super(nome, sobreNome, codigoDeProfessor);
        this.qtdDeHrs = qtdDeHrs;
    }

    public Integer getQtdDeHrs() {
        return qtdDeHrs;
    }

    public void setQtdDeHrs(Integer qtdDeHrs) {
        this.qtdDeHrs = qtdDeHrs;
    }
}
