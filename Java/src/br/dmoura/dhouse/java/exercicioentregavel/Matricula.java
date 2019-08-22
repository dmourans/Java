package br.dmoura.dhouse.java.exercicioentregavel;

import java.util.Date;

public class Matricula {
    private Aluno aluno;
    private Curso curso;
    private Date date;

    public Matricula(Aluno aluno, Curso curso, Date date) {
        this.aluno = aluno;
        this.curso = curso;
        this.date = date;
    }
}
