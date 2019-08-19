package br.dmoura.dhouse.java.revisao.orientacaoobjeto;

import java.util.ArrayList;
import java.util.List;

public class CadastroPessoas {

    private List<Pessoa> pessoas = new ArrayList<>();

    public void cadastrarPessoa (Pessoa pessoa){
        pessoas.add(pessoa);
    }

    public void imprimeCadastro(){
        for (int i = 0; i < pessoas.size(); i++ )
            System.out.println(pessoas.get(i).toString());
    }

}
