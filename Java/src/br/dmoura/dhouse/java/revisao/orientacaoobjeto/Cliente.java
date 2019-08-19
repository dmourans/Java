package br.dmoura.dhouse.java.revisao.orientacaoobjeto;

public class Cliente extends Pessoa {

    private int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int novoCodigo) {
        codigo = novoCodigo;
    }

    public Cliente(String novoNome, Data novoNascimento, int novoCodigo) {
        super(novoNome, novoNascimento);
        codigo = novoCodigo;
    }

    @Override
    public void imprimeDados() {
        System.out.println(super.getNome() + "\n"
                + super.getNascimento().toString() + "\n"
                + codigo);
    }
}
