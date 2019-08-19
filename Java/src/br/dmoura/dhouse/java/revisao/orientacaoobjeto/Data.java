package br.dmoura.dhouse.java.revisao.orientacaoobjeto;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int novoDia, int novoMes, int novoAno) {
        dia = novoDia;
        mes = novoMes;
        ano = novoAno;

    }

    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public void setAno(int novoAno) {
        ano = novoAno;
    }

    public void setMes(int novoMes) {
        mes = novoMes;
    }

    public void setDia(int novoDia) {
        dia = novoDia;
    }

    @Override
    public String toString() {
        return "Data{" +
                "dia=" + dia +
                ", mes=" + mes +
                ", ano=" + ano +
                '}';
    }
}
