package Loops_For_e_While.Exercicios.Exercicio2;

public class Principal {

    // João recebeu uma lista de valores representando as receitas de sua loja de roupas.
    // Ele quer calcular a soma total dessas receitas para entender o desempenho financeiro semanal.

    static void main(String[] args) {
        int[] valores = {10, 20, 30, 40, 50};
        int soma = 0;
        for(int valor : valores){
            soma += valor;
        }
        System.out.println("A soma total das receitas é: " + soma);
    }
}
