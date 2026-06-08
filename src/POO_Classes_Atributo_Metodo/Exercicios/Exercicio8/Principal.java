package POO_Classes_Atributo_Metodo.Exercicios.Exercicio8;

public class Principal {
    // Você está desenvolvendo um sistema de gerenciamento para uma loja de roupas e precisa garantir que o
    // estoque seja atualizado corretamente a cada venda realizada. Seu programa deve processar as vendas e
    // alertar quando não houver produtos suficientes no estoque.
    //
    // Crie um programa que:
    //
    // Defina uma classe com os atributos nome e quantidade.
    // Implemente um método que:
    // Subtraia a quantidade vendida do estoque se houver disponibilidade.
    // Exiba uma mensagem formatada com o saldo atual usando printf
    // Exiba um alerta “Estoque insuficiente” quando não for possível atender a venda.
    static void main(String[] args) {
        Produtos p1 = new Produtos("Camiseta", 5);
        p1.vender(1);
        p1.vender(2);
    }
}
