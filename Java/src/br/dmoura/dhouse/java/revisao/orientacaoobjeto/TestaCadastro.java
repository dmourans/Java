package br.dmoura.dhouse.java.revisao.orientacaoobjeto;

public class TestaCadastro {
    public static void main(String[] args) {

        Data novaDataCliente = new Data(10, 6, 2019);
        Data novaDataFuncionario = new Data(11, 7, 2020);
        Data novaDataGerente = new Data(12, 8, 2021);

        Cliente novoCliente = new Cliente("Jessica", novaDataCliente, 456);
        Funcionario novoFuncionario = new Funcionario("Luiz Daniel", novaDataFuncionario, 5000);
        Gerente novoGerente = new Gerente("Augusto", novaDataGerente, 34000, "GEO-DA");

        novoCliente.imprimeDados();
        novoFuncionario.imprimeDados();
        novoGerente.imprimeDados();

        CadastroPessoas novoCadastro = new CadastroPessoas();
        novoCadastro.cadastrarPessoa(novoCliente);
        novoCadastro.cadastrarPessoa(novoFuncionario);
        novoCadastro.cadastrarPessoa(novoGerente);
        novoCadastro.imprimeCadastro();

    }
}
