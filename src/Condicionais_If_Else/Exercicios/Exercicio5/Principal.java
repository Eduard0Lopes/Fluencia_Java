package Condicionais_If_Else.Exercicios.Exercicio5;

import java.util.Scanner;

public class Principal {

    // Marcos trabalha em uma loja e precisa verificar se um cliente tem direito a um desconto de 10% em sua compra.
    // O desconto é aplicado apenas se o valor da compra for maior ou igual a R$ 100,00. Para isso,
    // ele quer um programa que permita inserir o valor da compra e exiba se o desconto foi aplicado ou não,
    // juntamente com o novo valor após o desconto, caso aplicável.
    //
    // Com base nesse cenário, crie um programa que receba o valor da compra e exiba uma mensagem informando se o
    // desconto foi aplicado ou não.

    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor da compra");
        double valorCompra = input.nextDouble();

        if (valorCompra >= 100) {
            double desconto = (valorCompra * 10) / 100;
            double compraComDesconto = valorCompra - desconto;
            System.out.println("===============");
            System.out.println("Voce recebeu um desconto de 10% na sua compra!");
            System.out.println("Sua compra com desconto: " + compraComDesconto);
            System.out.println("===============");
        } else {
            System.out.println("===============");
            System.out.println("Valor da compra: " + valorCompra);
            System.out.println("Sem descontos.");
            System.out.println("===============");
        }

    }
}
