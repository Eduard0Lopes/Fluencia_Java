package Variaveis_e_Tipos.Exercicios.Exercicio6;

public class Principal {

    //  Você trabalha em um e-commerce e precisa classificar os produtos em diferentes categorias com base no preço.
    //
    //  Escreva um programa que classifique um produto em uma categoria com base em um preço e exiba a categoria
    //  correspondente, conforme as seguintes regras:
    //
    //  Econômico: preço até R$ 50,00.
    //  Intermediário: preço entre R$ 50,01 e R$ 200,00.
    //  Premium: preço acima de R$ 200,00. Exemplo de entrada:

    static void main() {
        double preco = 100.00;
        String categoriaProduto = "";
        if (preco <= 50) {
            categoriaProduto = "Economico";
        } else if (preco >= 50.01 && preco <= 200) {
            categoriaProduto = "Intermediario";
        } else {
            categoriaProduto = "Premium";
        }
        System.out.println("Categoria do produto: " + categoriaProduto);
    }
}
