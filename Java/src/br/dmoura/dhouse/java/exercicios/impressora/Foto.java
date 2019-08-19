package br.dmoura.dhouse.java.exercicios.impressora;

public class Foto implements Imprimivel {

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

    public Foto(String novoNome, String novoTipo) {
        nome = novoNome;
        tipo = novoTipo;
    }

    @Override
    public void imprimir() {
        System.out.println("Sou uma selfie | nome .: " + getNome() + " :: Tipo .: " + getTipo());

    }

    @Override
    public String toString() {
        return "Foto{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
