package POO_Classes_Atributo_Metodo.Exercicios.Exercicio9;

public class Principal {
    // Imagine que você está desenvolvendo um sistema de controle de devoluções para uma livraria.
    // Quando um livro é devolvido com atraso, é necessário calcular o valor da multa conforme os dias de atraso.
    //
    // Crie um programa que:
    //
    // Defina uma classe com os atributos título e dias de atraso.
    // Implemente um método que:
    // Cobre R$ 2,50 por dia de atraso.
    // Retorne o valor total da multa.
    // Implemente um método que mostre o título e o valor da multa formatado.

    static void main(String[] args) {
        PedidoLivro l1 = new PedidoLivro("Harry", 5);
        l1.exibirDetalhes();
    }
}
