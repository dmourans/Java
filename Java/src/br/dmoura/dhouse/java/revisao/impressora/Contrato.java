package br.dmoura.dhouse.java.revisao.impressora;

public class Contrato implements Imprimivel {

    private String nome;
    private String tipo;

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        nome = novoNome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String novoTipo) {
        tipo = novoTipo;
    }

    public Contrato(String novoNome, String novoTipo) {
        nome = novoNome;
        tipo = novoTipo;
    }

    @Override
    public void imprimir() {
        System.out.println("Sou um contrato muito legal | nome .: " + nome + " :: Tipo .: " + tipo);
    }

    @Override
    public String toString() {
        return "Contrato{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
