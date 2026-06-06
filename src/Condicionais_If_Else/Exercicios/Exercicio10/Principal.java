package Condicionais_If_Else.Exercicios.Exercicio10;

import java.util.Scanner;

public class Principal {

    // João está desenvolvendo um sistema de segurança para uma empresa. Para acessar o sistema
    // o usuário precisa fornecer:
    //
    //Um código de acesso numérico (o código correto é 2023).
    //
    //Um nível de permissão numérico (os níveis válidos são 1, 2 ou 3).
    //
    //O sistema só permitirá o acesso se:
    //
    //O código de acesso estiver correto.
    //
    //O nível de permissão for válido (1, 2 ou 3).
    //
    //Caso contrário, o acesso será negado, e o programa deve informar o motivo
    // (código incorreto, nível de permissão inválido ou ambos).
    //
    //Crie um programa que receba o código de acesso e o nível de permissão e exiba uma mensagem indicando se o
    // acesso foi permitido ou negado, além do motivo, se for o caso.

    static void main(String[] args) {

        int codigoAcesso = 2023;
        int nivelMin = 1;
        int nivelMax = 3;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o codigo");
        int codigo = input.nextInt();

        System.out.println("Digite o nivel de permissao");
        int nivelPermissao = input.nextInt();

        boolean codigoValido = codigo == codigoAcesso;
        boolean nivelCorreto = nivelPermissao >= nivelMin && nivelPermissao <= nivelMax;
        if (codigoValido && nivelCorreto) {
            System.out.println("Bem vindo ao sistema");
        } else {
            System.out.println("Não foi possivel acessar pois: ");
            if (!codigoValido) {
                System.out.println("Codigo invalido");
            }
            if (!nivelCorreto) {
                System.out.println("Nivel incorreto");
            }

        }
    }
}
