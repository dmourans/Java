package br.dmoura.dhouse.java.revisao.excecoes;

public class Main {
    public static void main(String[] args) {
        Integer soma = 0;
        try {
            Pessoa pessoa = new Pessoa();
            pessoa.setRg(4);
            soma = pessoa.getRg() + 0000000;
            System.out.println(pessoa.getRg() + 0);

        } catch (Exception e) {
            System.out.println("Ocorreu um erro :: " + e.getSuppressed());
            e.printStackTrace();
        } finally {

            if (soma > 2) {
                System.out.println("soma maior que 2");
            } else {
                System.out.println("soma menor que 2");
            }

        }
    }
}
