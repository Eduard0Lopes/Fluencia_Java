package POO_Classes_Atributo_Metodo.Exercicios.Exercicio1;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto (String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void mostraProduto(){
        System.out.printf("\nProduto: %s - R$%.2f - x%d", nome, preco, quantidade);
    }
}
