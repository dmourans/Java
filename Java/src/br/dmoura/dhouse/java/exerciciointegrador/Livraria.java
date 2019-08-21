package br.dmoura.dhouse.java.exerciciointegrador;

import java.util.ArrayList;
import java.util.List;

public class Livraria {
    //Lista de Libros
    private List<Livro> livros = new ArrayList<>();

    public void CadastrarLivro(Livro livro) {
        livros.add(livro);
    }

    // Consultar o livro individual
    public Livro ConsultarLivro(int codigo) {
        boolean achou = false;
        Livro livroAchado = null;

        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getCodigo() == codigo) {
                achou = true;
                //System.out.println(livros.get(i).toString());
                livroAchado = livros.get(i);
            }
        }
        if (achou == false) {
            System.out.println("Livro não encontrado.");
        }
        return livroAchado;
    }

    //Consultar varios codigos de livros
    public void ConsultarLivro(List<Integer> codigos) {
        //faço aqui uma logica para somente imprimir se houver livros
        boolean achou = false;

        for (int li = 0; li < livros.size(); li++) {
            for (int co = 0; co < codigos.size(); co++) {
                if (livros.get(li).getCodigo() == codigos.get(co)) {
                    achou = true;
                    //imprimo aqui a consulta de livros em toString()
                    System.out.println(livros.get(li).toString());
                }
            }
        }
        //Se não tem livros envia a mensagem abaixo
        if (achou == false) {
            System.out.println("Livro não encontrado.");
        }
    }

    public void EfetuarVenda(int codigo) {
        Livro livro = ConsultarLivro(codigo);

        if (livro != null && livro.getQuantidade() > 0) {
            //imprimo a quantidade de livros atuais no estoque
            System.out.println("Quantidade anterior: " + livro.getQuantidade());
            livro.setQuantidade(livro.getQuantidade() - 1);
            //Imprimo a quantidade de livro removendo uma unidade do item no estoque
            System.out.println("Quantidade atual: " + livro.getQuantidade());
        } else {
            System.out.println("Estoque esgotado.");
        }

    }
    //Crie uma coleção para vender os livros
    public void EfetuarVenda(Colecao colecao) {
        List<Livro> livros = colecao.getListaColecao();
        for (int i = 0; i < livros.size(); i++) {
            //chamo o metodo EfetuarVenda para validar a venda e remover do estoque o item vendido
            EfetuarVenda(livros.get(i).getCodigo());
            System.out.println("Coleção: " + colecao.getDescricao() + " venda do livro: " + livros.get(i).getCodigo() + " - estoque: " +  livros.get(i).getQuantidade());
        }

    }

}
