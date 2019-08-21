package br.dmoura.dhouse.java.exerciciointegrador;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        Livro livro1 = new Livro(1,"tit1", "aut1", 2019, 1,2,17);
        Livro livro2 = new Livro(2,"tit2", "aut2", 2019, 1,4,15);
        Livro livro3 = new Livro(3,"tit3", "aut3", 2019, 1,5,13);
        Livro livro4 = new Livro(4,"tit4", "aut4", 2019, 1,8,2);
        Livro livro5 = new Livro(5,"tit5", "aut5", 2019, 1,9,1);

        Livraria livraria = new Livraria();
        livraria.CadastrarLivro(livro1);
        livraria.CadastrarLivro(livro2);
        livraria.CadastrarLivro(livro3);
        livraria.CadastrarLivro(livro4);
        livraria.CadastrarLivro(livro5);

        //Somente um livro
        //livraria.ConsultarLivro(5);

        //Varios livros
        List<Integer> codigos = new ArrayList<>();
        codigos.add(2);
        codigos.add(4);
        //livraria.ConsultarLivro(codigos);

        //Vender uma unidade do livro
        //livraria.EfetuarVenda(2);
        //livraria.EfetuarVenda(2);
        //livraria.EfetuarVenda(77);

        //Criando coleções
        List<Livro> colecao1 = new ArrayList<>();
        colecao1.add(livro1);
        colecao1.add(livro2);
        Colecao box1 = new Colecao(colecao1, 12, 90.0,"Esse é um box 1.");

        List<Livro> colecao2 = new ArrayList<>();
        colecao2.add(livro3);
        colecao2.add(livro4);
        Colecao box2 = new Colecao(colecao2, 12, 90.0,"Esse é um box 2.");

        List<Livro> colecao3 = new ArrayList<>();
        colecao3.add(livro5);
        colecao3.add(livro1);
        Colecao box3 = new Colecao(colecao3, 12, 90.0,"Esse é um box 3.");

        //Efetuando a venda de uma coleção
        livraria.EfetuarVenda(box1);
        livraria.EfetuarVenda(box2);
        livraria.EfetuarVenda(box3);

    }
}
