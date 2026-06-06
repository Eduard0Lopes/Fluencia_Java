package Variaveis_e_Tipos.Exercicios.Exercicio7;

public class Principal {

    // Você está desenvolvendo um jogo e quer um programa que determine se um número é par ou ímpar.
    //
    //  Escreva um programa que classifique um número e exiba uma mensagem informando se o número é par ou ímpar.
    //
    //  Exemplo de entrada:

    static void main() {
        int numero = 1;

        if (numero % 2 == 0) {
            System.out.println("O numero " + numero +" é par");
        } else {
            System.out.println("o numero "+ numero +" é impar");
        }
    }
}
