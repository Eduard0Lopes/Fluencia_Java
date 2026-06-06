package Condicionais_If_Else.Exercicios.Exercicio7;

import java.util.Scanner;

public class Principal {
    // Emerson trabalha em um banco e precisa verificar se um número digitado pelo cliente está dentro da
    // faixa permitida de valores para um empréstimo, que vai de 1000 a 5000 reais.
    //
    //Crie um programa que receba um valor e exiba se ele está dentro do intervalo permitido ou não.

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do emprestimo: ");
        double valorEmprestimo = input.nextDouble();

        if (valorEmprestimo >= 1000 && valorEmprestimo <= 5000) {
            System.out.println("O valor de " + valorEmprestimo + " está dentro do range desejado");
        } else {
            System.out.println("O valor de " + valorEmprestimo + " não está dentro do alcance.");
        }
    }
}
