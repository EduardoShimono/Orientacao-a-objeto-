package Exercicio3;

public class ContaCorrente extends ContaBancaria {
    private double tarifaMensal;

    public void cobrarTarifaMensal() {
        saldo -= tarifaMensal;
        System.out.printf("Tarifa mensal de %f cobrada. Saldo Atual %f\n", tarifaMensal, saldo);
    }
}
