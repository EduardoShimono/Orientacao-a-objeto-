package Exercicio21;

public class ConversorMoeda implements ConversaoFinanceira {
    @Override
    public void converterDolarParaReal(double valorDolar) {
        double cotacaoDoDolar = 4.80;
        double valorEmReal = valorDolar * cotacaoDoDolar;
        System.out.println("O valor em reias é: R$" + valorEmReal);
    }
}
