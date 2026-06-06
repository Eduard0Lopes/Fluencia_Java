package Condicionais_If_Else.Exercicios.Exercicio8;

import java.util.Scanner;

public class Principal {

    // Marcos está estudando geometria e precisa verificar se três lados podem formar um triângulo.
    // Para que três lados formem um triângulo, a soma de dois lados deve ser maior que o terceiro lado.
    // Ele quer um programa que receba três lados e exiba uma mensagem informando se os lados podem formar um
    // triângulo ou não.
    //
    // Com base nesse cenário, crie um programa que receba três lados e exiba uma mensagem informando se os lados
    // podem formar um triângulo ou não.

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro lado");
        int lado1 = input.nextInt();
        System.out.println("Digite o segundo lado");
        int lado2 = input.nextInt();
        System.out.println("Digite o terceiro lado");
        int lado3 = input.nextInt();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("Os lados podem formar um triângulo.");
        } else {
            System.out.println("Os lados não podem formar um triângulo.");
        }
    }
}
