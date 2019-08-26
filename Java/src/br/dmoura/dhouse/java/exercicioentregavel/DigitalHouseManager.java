package br.dmoura.dhouse.java.exercicioentregavel;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {
    private List<Aluno> alunos = new ArrayList<>();
    private List<Professor> professores = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();
    private List<Matricula> matriculas = new ArrayList<>();

    public void registrarCurso(Curso curso) {
        cursos.add(curso);
        System.out.println("Curso :: " + curso.getNome() + " || Adicionado com sucesso.");
    }

    public void excluirCurso(Curso curso) {
        cursos.remove(curso);
        System.out.println("Curso :: " + curso.getNome() + " || Excluido com sucesso.");
    }

    public void alocarProfessores(Integer codigoDoCurso, Integer codigoProfessorTitular, Integer qtdMaximaAlunos) {

    }

    public void matricularAluno(Integer codigoAluno, Integer codigoCurso) {

    }

    public void matricularAluno(String nome, String sobrenome, Integer codigoAluno) {

    }

    public void excluirProfessor(Professor professor) {

    }

    public void registrarProfessorTitular(){

    }

    public void registrarProfessorAdjunto(){

    }

    public List<Curso> consultarCursos(Aluno aluno){

        return null;
    }

}