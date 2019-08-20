package br.dmoura.dhouse.java.exerciciointegrador;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Livro livro1 = new Livro(1,"tit1", "aut1", 2019, 1,1,17);
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

        //um livro
        //livraria.ConsultarLivro(5);

        //varios livros
        List<Integer> codigos = new ArrayList<>();
        codigos.add(2);
        codigos.add(4);
        //livraria.ConsultarLivro(codigos);

//        livraria.EfetuarVenda(2);
//        livraria.EfetuarVenda(2);
//        livraria.EfetuarVenda(2);
//        livraria.EfetuarVenda(2);
        livraria.EfetuarVenda(77);




    }
}
