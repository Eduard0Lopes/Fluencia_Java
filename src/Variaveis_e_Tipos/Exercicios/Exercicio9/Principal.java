package Variaveis_e_Tipos.Exercicios.Exercicio9;

public class Principal {
    // Você está desenvolvendo um programa que precisa verificar se uma pessoa é maior de idade ou não.
    // O programa deve exibir uma mensagem informando se a pessoa pode ou não acessar um determinado conteúdo restrito.
    // No entanto, você cometeu um erro ao implementar a lógica de verificação e precisa corrigir isso.
    //
    //Sua tarefa é:
    //
    //Identificar e corrigir o erro de escopo de variáveis no código.
    //Garantir que o programa exiba a mensagem correta com base na idade da pessoa, no código abaixo a saída será
    // Você é menor de idade.
    static void main(String[] args) {
        int idade = 19;
        String mensagem;

            if (idade >= 18) {
                 mensagem = "Você é maior de idade.";
            } else {
                 mensagem = "Você é menor de idade.";
            }

            System.out.println(mensagem);
    }
}
