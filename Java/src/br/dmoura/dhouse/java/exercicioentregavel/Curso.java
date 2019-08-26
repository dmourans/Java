package br.dmoura.dhouse.java.exercicioentregavel;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {
    private String nome;
    private Integer codigoDoCurso;
    private Integer qtdMaximaAlunos;
    private ProfessorTitular profTitular;
    private ProfessorAdjunto profAdjunto;
    List<Aluno> listaAlunos = new ArrayList<>();

    public Curso(String nome, Integer codigoDoCurso, Integer qtdMaximaAlunos, ProfessorTitular profTitular, ProfessorAdjunto profAdjunto) {
        this.nome = nome;
        this.codigoDoCurso = codigoDoCurso;
        this.qtdMaximaAlunos = qtdMaximaAlunos;
        this.profTitular = profTitular;
        this.profAdjunto = profAdjunto;
    }

    public Integer getQtdMaximaAlunos() {
        return qtdMaximaAlunos;
    }

    public void setQtdMaximaAlunos(Integer qtdMaximaAlunos) {
        this.qtdMaximaAlunos = qtdMaximaAlunos;
    }

    public ProfessorTitular getProfTitular() {
        return profTitular;
    }

    public void setProfTitular(ProfessorTitular profTitular) {
        this.profTitular = profTitular;
    }

    public ProfessorAdjunto getProfAdjunto() {
        return profAdjunto;
    }

    public void setProfAdjunto(ProfessorAdjunto profAdjunto) {
        this.profAdjunto = profAdjunto;
    }

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigoDoCurso() {
        return codigoDoCurso;
    }

    public void setCodigoDoCurso(Integer codigoDoCurso) {
        this.codigoDoCurso = codigoDoCurso;
    }

    public boolean adicionarUmAluno(Aluno umAluno){
        listaAlunos.add(umAluno);
        System.out.println("O Aluno :: " + umAluno.getNome() + " foi cadastrado com sucesso");
        return true;
    }

    public void excluirUmAluno(Integer codigoDoCurso){
        for (int i = 0; i < listaAlunos.size(); i++) {
            if (listaAlunos.get(i).getCodigo().equals(codigoDoCurso)){
                listaAlunos.remove(listaAlunos.get(i));
            } else {
                System.out.println("Aluno não localizado.");
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(codigoDoCurso, curso.codigoDoCurso);
    }

}
