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
    private List<Aluno> listaAlunos = new ArrayList<>();

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

    public boolean adicionarUmAluno(Aluno umAluno) {

        if (qtdMaximaAlunos > listaAlunos.size()) {
            listaAlunos.add(umAluno);
            System.out.println("O Aluno :: " + umAluno.getNome() + " foi cadastrado com sucesso");
            return true;

        } else {
            System.out.println("O Aluno :: " + umAluno.getNome() + " não foi cadastrado por não haver vagas disponiveis");
            return false;
        }

    }

    public void excluirUmAluno(Aluno umAluno) {
        listaAlunos.remove(umAluno);
        System.out.println("Aluno removido.");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(codigoDoCurso, curso.codigoDoCurso);
    }

}
