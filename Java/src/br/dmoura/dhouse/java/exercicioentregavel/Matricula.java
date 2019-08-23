package br.dmoura.dhouse.java.exercicioentregavel;

import java.util.Date;
import java.util.List;

public class Matricula {
    private Aluno aluno;
    private Curso curso;
    private Date date;

    public Matricula(Aluno aluno, Curso curso) {
        this.aluno = aluno;
        this.curso = curso;
        this.date = new Date();
    }

    public void consultarCursos(){

    }

}
