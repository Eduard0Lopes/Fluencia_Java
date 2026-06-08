package POO_Classes_Atributo_Metodo.Exercicios.Exercicio10;

public class Carrinho {
    String nome;
    double preco;
    int quantidade;

    Carrinho(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
     double valorTotal(){
        return quantidade * preco;
    }
}
