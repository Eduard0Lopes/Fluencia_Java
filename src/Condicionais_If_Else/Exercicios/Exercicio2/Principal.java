package Condicionais_If_Else.Exercicios.Exercicio2;

public class Principal {

    // Julia é professora e precisa de um programa que ajude a determinar se um aluno foi aprovado na
    // disciplina. A regra da escola é:
    //
    //O estudante é aprovado se média final é maior ou igual a 7.0.
    //
    //Se a média for entre 5.0 e 6.9, está de recuperação.
    //
    //Se for abaixo de 5.0, está reprovado.
    //
    //Crie um programa que, a partir de uma variável media, exiba a situação do estudante conforme as regras da escola.

    static void main() {
        double mediaNota = 5.0;

        if (mediaNota <= 5.0) {
            System.out.println("Com uma media de " + mediaNota + " este aluno esta reprovado.");
        } else if (mediaNota > 5.01 && mediaNota < 6.9) {
            System.out.println("Com uma media de " + mediaNota + " este aluno esta de recuperação");
        } else {
            System.out.println("Com uma media de " + mediaNota + " este aluno está aprovado");
        }
    }
}
