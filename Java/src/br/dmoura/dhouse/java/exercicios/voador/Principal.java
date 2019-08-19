package br.dmoura.dhouse.java.exercicios.voador;

public class Principal {
    public static void main(String[] args) {
        Pato novoPato = new Pato(10);
        Aviao novoAviao = new Aviao(10);
        SuperHomen novoSuper = new SuperHomen(10);
        TorreDeControle novaTorre = new TorreDeControle();

        novoPato.voar();
        novoAviao.voar();
        novoSuper.voar();

        novaTorre.voemTodos();
    }
}
