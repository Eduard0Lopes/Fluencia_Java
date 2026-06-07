package POO_Classes_Atributo_Metodo.Exercicios.Exercicio3;

public class Principal {

    //Imagine que você está desenvolvendo um sistema de conta digital onde os usuários podem realizar
    // transações financeiras. Em determinadas situações, como encerramento de conta
    // é necessário zerar o saldo disponível.
    //
    //Crie um programa que:
    //
    //Defina uma classe com o atributo saldo.
    //Implemente um método que redefine o valor do saldo para 0.0.
    //Implemente um método que mostra o saldo atual formatado.

    static void main(String[] args) {
        Conta conta1 = new Conta(5000);
        conta1.exibirSaldo();
        conta1.zerarSaldo();
        conta1.exibirSaldo();
    }
}
