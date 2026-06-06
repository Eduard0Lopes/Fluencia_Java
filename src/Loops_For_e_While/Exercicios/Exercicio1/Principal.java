package Loops_For_e_While.Exercicios.Exercicio1;

import java.util.Scanner;

public class Principal {

    // Carla começou a praticar trilha e deseja saber quantos degraus precisará subir para chegar ao topo de uma
    // escadaria. Ela sobe um degrau por vez e quer um programa que mostre sua subida até o topo.
    // Sua tarefa é criar um programa que receba um número e simule a subida da escadaria.

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de degraus");
        int numeroDegraus = input.nextInt();

        for (int i = 1; i <= numeroDegraus; i++) {
            System.out.println("Subindo degrau: " + i);
        }
        System.out.println("Chegou ao topo");
    }
}

