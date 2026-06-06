package Condicionais_If_Else.Exercicios.Exercicio6;

import java.util.Scanner;

public class Principal {

    // Carlos trabalha em uma empresa de logística que opera apenas de segunda a sexta, sem atividades nos finais de semana. Para evitar confusões, ele precisa de um programa que, ao receber um dia da semana, informe se é um dia útil ou não.
    //
    //Crie um programa que receba um dia da semana (em letras minúsculas) e exiba uma mensagem indicando se é um dia útil ou não.

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String diaSemana = input.next();

        if (diaSemana.equals("sabado")  || diaSemana.equals("domingo")) {
            System.out.println(diaSemana + " não é dia util");
        } else {
            System.out.println(diaSemana + " é um dia util");
        }
    }
}
