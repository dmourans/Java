package br.dmoura.dhouse.java.exercicioentregavel;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {
    private List<Aluno> alunos = new ArrayList<>();
    private List<Professor> professores = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();
    private List<Matricula> matriculas = new ArrayList<>();

    public void registrarCurso(String nome, Integer codigoCurso, Integer qtdMaximaAlunos) {

        Curso curso = new Curso();
        curso.setCodigoDoCurso(codigoCurso);
        curso.setNome(nome);
        curso.setQtdMaximaAlunos(qtdMaximaAlunos);
        cursos.add(curso);
        System.out.println("Curso :: " + curso.getNome() + " || Adicionado com sucesso.");
    }

    public void excluirCurso(Integer codigoDoCurso) {
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getCodigoDoCurso().equals(codigoDoCurso)) {
                cursos.remove(cursos.get(i));
                System.out.println("Curso removido com sucesso.");

            } else {
                System.out.println("Curso não localizado.");
            }
        }
    }

    public void alocarProfessores(Integer codigoDoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto) {

        Curso curso = null;
        ProfessorTitular professorTitular = null;
        ProfessorAdjunto professorAdjunto = null;

        //Procuro o Curso
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getCodigoDoCurso().equals(codigoDoCurso)) {
                //set o curso se o encontrar
                curso = cursos.get(i);
            }
        }

        //Procuro o professor titular
        for (int i = 0; i < professores.size(); i++) {
            if (professores.get(i).getCodigoDeProfessor().equals(codigoProfessorTitular)) {
                //Set o aluno se o encontrar
                professorTitular = (ProfessorTitular) professores.get(i);
            }
        }

        //Procuro o professor adjunto
        for (int i = 0; i < professores.size(); i++) {
            if (professores.get(i).getCodigoDeProfessor().equals(codigoProfessorAdjunto)) {
                //set o curso se o encontrar
                professorAdjunto = (ProfessorAdjunto) professores.get(i);
            }
        }

        if (curso != null && professorTitular != null && professorAdjunto != null) {
            //inclui ambos no curso
            curso.setProfTitular(professorTitular);
            curso.setProfAdjunto(professorAdjunto);
            System.out.println("Curso :: " + curso.getNome()
                    + " || Professor Titular :: "
                    + curso.getProfTitular().getEspecialidade()
                    + " || Professor Adjunto :: "
                    + curso.getProfAdjunto().getNome() + " || Adicionados");
        }

    }

    public void matricularAluno(Integer codigoAluno, Integer codigoCurso) {

        Curso curso = null;
        Aluno aluno = null;
        Matricula matricula;

        //Procuro o Curso
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getCodigoDoCurso().equals(codigoCurso)) {
                //set o curso se o encontrar
                curso = cursos.get(i);
            }
        }

        //Procuro o Aluno
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getCodigo().equals(codigoAluno)) {
                //Set o aluno se o encontrar
                aluno = alunos.get(i);
            }
        }

        //Encontrei Aluno e Curso, vou matricular
        if (curso != null && aluno != null) {

            if (curso.adicionarUmAluno(aluno)) {
                matricula = new Matricula(aluno, curso);
                matriculas.add(matricula);
            }

        } else {
            if (aluno == null) {
                System.out.println("Aluno não encontrado");
            }
            if (curso == null) {
                System.out.println("Curso não encontrado");
            }
        }
    }

    public void matricularAluno(String nome, String sobrenome, Integer codigoAluno) {

        Aluno aluno = new Aluno(nome, sobrenome, codigoAluno);
        alunos.add(aluno);
        System.out.println("Aluno :: " + aluno.getNome() + " || Adicionado com sucesso.");
    }

    public void excluirProfessor(Integer codigoProfessor) {

        for (int i = 0; i < professores.size(); i++) {
            if (professores.get(i).getCodigoDeProfessor().equals(codigoProfessor)) {
                professores.remove(professores.get(i));
                System.out.println("Professor removido com sucesso.");

            } else {
                System.out.println("Professor não localizado.");
            }
        }

    }

    public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidade) {

        ProfessorTitular professorTitular = new ProfessorTitular();

        professorTitular.setTempoDeCasa(0);
        professorTitular.setNome(nome);
        professorTitular.setSobreNome(sobrenome);
        professorTitular.setCodigoDeProfessor(codigoProfessor);
        professorTitular.setEspecialidade(especialidade);

        professores.add(professorTitular);

        System.out.println("Professor Titular :: " + professorTitular.getNome() + " || Adicionado");

    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer qtdHoras) {

        ProfessorAdjunto professorAdjunto = new ProfessorAdjunto();
        professorAdjunto.setTempoDeCasa(0);
        professorAdjunto.setNome(nome);
        professorAdjunto.setSobreNome(sobrenome);
        professorAdjunto.setCodigoDeProfessor(codigoProfessor);
        professorAdjunto.setQtdDeHrs(qtdHoras);

        professores.add(professorAdjunto);

        System.out.println("Professor Adjunto :: " + professorAdjunto.getNome() + " || Adicionado");

    }

    public List<Curso> consultarCursos(Aluno aluno) {
        return null;
    }

}