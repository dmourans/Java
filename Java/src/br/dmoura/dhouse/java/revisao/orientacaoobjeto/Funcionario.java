package br.dmoura.dhouse.java.revisao.orientacaoobjeto;

public class Funcionario extends Pessoa implements Imposto {

    private float salario;
    private float porcentagem;

    public Funcionario(String novoNome, Data novoNascimento, float novoSalario) {
        super(novoNome, novoNascimento);
        salario = novoSalario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float novoSalario) {
        salario = novoSalario;
    }

    @Override
    public void imprimeDados() {
        float salarioComImposto = salario - calcularImposto();
        System.out.println(super.getNome() + "\n"
                + "O saldo com imposto do funcionário é .: " + salarioComImposto);
    }

    @Override
    public float calcularImposto() {
        float calImposto = (float) (salario * 0.03);
        return calImposto;
    }
}
