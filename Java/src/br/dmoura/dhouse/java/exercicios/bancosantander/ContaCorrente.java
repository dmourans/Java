package br.dmoura.dhouse.java.exercicios.bancosantander;

public class ContaCorrente extends Contas {
    private double limite;

    @Override
    public void sacar(double valor) {
        System.out.println("valor desejado: " + valor);

        if (this.getSaldo() < valor) {
            if (limite > valor) {
                System.out.println("Você esta acessando seu limite");
                limite = limite - (this.getSaldo() - valor);
                this.setSaldo(limite);

            } else {
                System.out.println("pobretao");
            }
            System.out.println("Saque realizado. novo saldo: " +this.getSaldo());
        }
    }

   public void depositar(Cheque cheque){
       // this.getSaldo(getSaldo() + cheque.getValor());
   }
}
