package Exercicio3;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(1000);
        conta.consultarSaldo();

        ContaCorrente conta1 = new ContaCorrente();
        conta1.depositar(200);
        conta1.cobrarTarifaMensal();
        conta1.sacar(150);
        conta1.consultarSaldo();
    }
}
