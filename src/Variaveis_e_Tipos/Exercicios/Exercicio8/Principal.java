package Variaveis_e_Tipos.Exercicios.Exercicio8;

public class Principal {
    // Você está organizando uma viagem internacional e precisa converter uma quantia em reais (R$) para
    // dólares americanos (US$) com base na taxa de câmbio atual. A taxa utilizada no momento é de
    // R$ 5,25 para cada US$ 1.
    //
    // Crie um programa que realize a conversão para dólares usando a taxa de câmbio e exiba o valor convertido.
    //
    // Exemplo de entrada: double valorReais = 451.50;
    // Saida esperada: O valor em dólares é: US$ 86.0
    static void main() {
        double valorReais = 451.50;
        double cotacaoDolar = 5.25;

        double converteDolarReal = valorReais / cotacaoDolar;
        System.out.println("O valor em dolares é: US$ " + converteDolarReal);
    }
}
