package Exercicio1;

public class TesteCarro {
    public static void main(String[] args) {
        ModeloCarro carro = new ModeloCarro();
        carro.definirModelo("Honda Fit");
        carro.definirPrecos(20000, 25000, 19000);
        carro.exibirInfo();
    }
}
