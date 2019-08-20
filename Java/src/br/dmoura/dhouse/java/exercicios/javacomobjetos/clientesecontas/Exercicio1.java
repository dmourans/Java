package br.dmoura.dhouse.java.exercicios.javacomobjetos.clientesecontas;

public class Exercicio1 {

    public static void main(String[] args) {

        //defino um objeto do tipo cliente, que é um titular da conta.
        Cliente novoCliente1 = new Cliente("Luiz","Daniel Dias dos Santos");
        Cliente novoCliente2 = new Cliente("Augusto","Alves Rodrigues de Jesus");

        //aqui eu setto meu titular com o objeto Cliente
        Conta novaConta1 = new Conta(1234,1234, novoCliente1);
        Conta novaConta2 = new Conta(4321,4321, novoCliente2);

        novaConta1.deposito(99);
        novaConta2.deposito(99);

        novaConta1.saque(69);
        novaConta2.saque(69);

    }

}
