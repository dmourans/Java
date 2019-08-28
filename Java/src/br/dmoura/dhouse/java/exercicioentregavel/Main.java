package br.dmoura.dhouse.java.exercicioentregavel;

public class Main {

    public static void main(String[] args) {

        DigitalHouseManager digitalHouseManager = new DigitalHouseManager();
        //Dois Professores Titulares e Adjuntos.
        digitalHouseManager.registrarProfessorTitular("Nina", "Lofrese",1,"Java");
        digitalHouseManager.registrarProfessorTitular("Luiz", "Dias", 2, "C#");
        digitalHouseManager.registrarProfessorAdjunto("Ulysses", "Mourão", 3,10);
        digitalHouseManager.registrarProfessorAdjunto("Talita", "Noccetti", 4, 20);

        //Dois Cursos.
        digitalHouseManager.registrarCurso("Full Stack",20001,3);
        digitalHouseManager.registrarCurso("Android", 20002, 2);

        //Alocar professores titulares e adjuntos aos cursos.
        digitalHouseManager.alocarProfessores(20001,1,3);
        digitalHouseManager.alocarProfessores(20002,2,4);

        //Matriculando 5 Alunos.
        digitalHouseManager.matricularAluno("Sergio","Strutzel",5);
        digitalHouseManager.matricularAluno("Victor", "Sewaybricker", 6);
        digitalHouseManager.matricularAluno("Nicolas", "Varzacacou", 7);
        digitalHouseManager.matricularAluno("Andréia", "Yoshinari", 8);
        digitalHouseManager.matricularAluno("Maíra", "Scarance", 9);

        //Dois alunos para Full Stack e tres para Android.
        digitalHouseManager.matricularAluno(5,20001);
        digitalHouseManager.matricularAluno(6,20001);
        digitalHouseManager.matricularAluno(7,20002);
        digitalHouseManager.matricularAluno(8,20002);
        digitalHouseManager.matricularAluno(9,20002);

    }

}
