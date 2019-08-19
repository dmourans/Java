package br.dmoura.dhouse.java.revisao.orientacaoobjeto;

public class Gerente extends Funcionario implements Imposto{

    private String area;

    public String getArea() {
        return area;
    }

    public void setArea(String novaArea) {
        area = novaArea;
    }

    public Gerente(String novoNome, Data novoNascimento, float novoSalario, String novaArea) {
        super(novoNome, novoNascimento, novoSalario);
        area = novaArea;
    }

    public float calculaImposto() {
        float calImposto = (float) (super.getSalario() * 0.05);
        return calImposto;
    }

    @Override
    public void imprimeDados() {
        float salarioComImposto = calculaImposto();
        System.out.println(super.getNome() + "\n"
                + "O saldo com imposto do gerente é .: " + salarioComImposto + "\n"
                + "Area .: " + getArea());
    }
}
