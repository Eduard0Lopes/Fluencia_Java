package Condicionais_If_Else.Exercicios.Exercicio4;

import java.util.Scanner;

public class Principal {

    // Pedro está aprendendo Java e se deparou com um problema:
    // ele precisa criar um programa que compare dois números inteiros fornecidos pelo usuário e informe
    // qual é o maior ou se são iguais. Mas, ele está com dificuldades para implementar a lógica de comparação e exibir
    // o resultado corretamente.
    //
    //Ajude Pedro a resolver esse problema! Crie um programa que solicite ao usuário dois números inteiros,
    // compare-os e exiba uma mensagem indicando qual é o maior ou se ambos são iguais.

    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int numero1 = input.nextInt();
        System.out.println("Digite o segundo numero: ");
        int numero2 = input.nextInt();

        if (numero1 > numero2){
            System.out.println("O numero 1 é maior que o 2.");
        } else if (numero1 < numero2) {
            System.out.println("O numero 1 é menor ao numero 2");
        } else {
            System.out.println("Os numeros são iguais");
        }
    }
}
