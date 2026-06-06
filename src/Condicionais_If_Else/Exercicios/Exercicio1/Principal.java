package Condicionais_If_Else.Exercicios.Exercicio1;

public class Principal {

    // Ana precisa identificar se um número é par ou ímpar para um jogo que está desenvolvendo.
    // Para isso, deseja criar um programa que analisa se o número que ela definiu previamente é par ou ímpar.
    //
    // Como você ajudaria Ana a escrever um programa que determine se um número é par ou ímpar e exiba o
    // resultado corretamente?

    static void main() {
        int numero = 5;

        if (numero % 2 == 0) {
            System.out.println("Numero " + numero + "é par");
        } else {
            System.out.println("Numero " + numero + " é impar");
        }
    }
}
