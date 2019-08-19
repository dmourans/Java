package br.dmoura.dhouse.java.revisao.orientacaoobjeto;

public abstract class Pessoa {
    private String nome;
    private Data nascimento;

    public Pessoa (String novoNome, Data novoNascimento){
        nome = novoNome;
        nascimento = novoNascimento;
    }

    public abstract void imprimeDados();

    public Data getNascimento() {
        return nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNascimento(Data novoNascimento) {
        nascimento = novoNascimento;
    }

    public void setNome(String novoNome) {
        nome = novoNome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", nascimento=" + nascimento +
                '}';
    }
}
