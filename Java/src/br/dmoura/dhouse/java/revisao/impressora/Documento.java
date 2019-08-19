package br.dmoura.dhouse.java.revisao.impressora;

public class Documento implements Imprimivel {

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

    public Documento(String novoNome, String novoTipo) {
        nome = novoNome;
        tipo = novoTipo;
    }

    @Override
    public void imprimir() {
        System.out.println("Sou um documento do word | nome .: " + nome + " :: Tipo .: " + tipo);
    }

    @Override
    public String toString() {
        return "Documento{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
