package br.dmoura.dhouse.java.exerciciointegrador;

import java.util.ArrayList;
import java.util.List;

public class Livraria {
    private List<Livro> livros = new ArrayList<>();

    public void CadastrarLivro(Livro livro) {
        livros.add(livro);
    }

    //individual
    public Livro ConsultarLivro(int codigo) {
        boolean achou = false;
        Livro livroAchado = null;

        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getCodigo() == codigo) {
                achou = true;
                System.out.println(livros.get(i).toString());
                livroAchado = livros.get(i);
            }
        }
        if (achou == false) {
            System.out.println("Livro não encontrado.");
        }
        return livroAchado;
    }

    //varios codigos de livros
    public void ConsultarLivro(List<Integer> codigos) {
        boolean achou = false;

        for (int li = 0; li < livros.size(); li++) {
            for (int co = 0; co < codigos.size(); co++) {
                if (livros.get(li).getCodigo() == codigos.get(co)) {
                    achou = true;
                    System.out.println(livros.get(li).toString());
                }
            }
        }
        if (achou == false) {
            System.out.println("Livro não encontrado.");
        }
    }

    public void EfetuarVenda(int codigo) {
        Livro livro = ConsultarLivro(codigo);

        if (livro != null && livro.getQuantidade() > 0) {
            System.out.println("Quantidade anterior: " + livro.getQuantidade());
            livro.setQuantidade(livro.getQuantidade() - 1);
            System.out.println("Quantidade atual: " + livro.getQuantidade());
        } else {
            System.out.println("Estoque esgotado.");
        }

    }
}
