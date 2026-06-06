package Condicionais_If_Else.Exercicios.Exercicio9;

import java.util.Scanner;

public class Principal {

    // Maria trabalha em um banco de sangue e precisa verificar se um doador é compatível para doar sangue.
    // Para ser compatível, o doador deve atender aos seguintes critérios:
    //
    //Ter entre 18 e 65 anos.
    //
    //Pesar mais de 50 kg.
    //
    //Ela deseja um programa que receba a idade e o peso do doador e informe se ele é compatível para doar sangue.
    // Se não for, o programa deve indicar qual critério não foi atendido.
    //
    //Como você criaria um programa que receba a idade e o peso do doador e exiba uma mensagem indicando se ele é
    // compatível ou não, além de informar o critério não atendido, se for o caso?

    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a idade do doador");
        int idade = input.nextInt();
        System.out.println("Digite o peso do doador");
        double peso = input.nextDouble();

        boolean idadePermitida = idade >= 18 && idade <= 65;
        boolean pesoValido = peso > 50;

        if (idadePermitida && pesoValido) {
            System.out.println("O doador pode realizar a ação");
        } else {
            System.out.println("Doação não sera possivel pois: ");
            if (!idadePermitida) {
                System.out.println(" - O Doador não possui a idade permitida");
            }
        } if (!pesoValido) {
            System.out.println(" - O Doador não possui o peso permitido");
        }
    }
}
