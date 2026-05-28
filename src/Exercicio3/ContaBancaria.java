package Exercicio3;

public class ContaBancaria {
    protected double saldo;
    private String Titular;
    private int cod;

    public void depositar (double valor){
        saldo += valor;
        System.out.printf("deposito de %f realizado. Saldo atual: %f\n", saldo, valor);
    }
    public void sacar(double valor) {
        if (valor <= saldo){
            saldo -= valor;
            System.out.printf("valor de %f foi descontado da sua conta. Saldo atual %f\n", valor, saldo);
        }else {
            System.out.println("Saldo insulficiente para saque.\n");
        }
    }
    public void consultarSaldo() {
        System.out.printf("Saldo atual: %f\n", saldo);
    }
}
