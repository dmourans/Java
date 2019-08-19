package br.dmoura.dhouse.java.exercicios.excecoes;

public class CalculoMatematico {

    public int divisao (  int dividendo, int divisor) throws ArithmeticException {
        int resultado;
        if (divisor == 0){
            throw new ArithmeticException("Divisão por 0 não acontece nada amiguinho.");
        }else {
        resultado = dividendo / divisor;
        return resultado;
        }
    }
}
