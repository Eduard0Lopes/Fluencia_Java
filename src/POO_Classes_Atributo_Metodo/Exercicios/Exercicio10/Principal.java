package POO_Classes_Atributo_Metodo.Exercicios.Exercicio10;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    // Você está desenvolvendo o sistema de checkout de um e-commerce de produtos eletrônicos.
    // Seu desafio é calcular o valor total do carrinho de compras, considerando que cada produto pode ter
    // quantidades diferentes e preços variados.
    //
    // Crie um programa que:
    //
    // Defina uma classe com os atributos nome, preço e quantidade.
    // Implemente um método que retorne o valor total do item (preço x quantidade).
    // Crie uma lista de item e calcule o valor total da compra.

    static void main(String[] args) {
        Carrinho p1 = new Carrinho("Teclado Gamer", 500, 2);
        Carrinho p2 = new Carrinho("Mouse Gamer", 500, 1);

        List<Carrinho> carrinho = new ArrayList<>();
        carrinho.add(p1);
        carrinho.add(p2);

        double totalCompra = 0;

        for(Carrinho item: carrinho){
            totalCompra  += item.valorTotal();
        }
        System.out.printf(
                "Total da compra: R$ %.2f", totalCompra
        );
    }
}
