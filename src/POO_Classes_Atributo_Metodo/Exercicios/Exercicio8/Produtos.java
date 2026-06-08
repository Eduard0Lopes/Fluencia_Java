package POO_Classes_Atributo_Metodo.Exercicios.Exercicio8;

public class Produtos {
    String nomeProduto;
    int quantidade;

    public Produtos(String nomeProduto, int quantidade){
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
    }

    public void vender(int qtdVendidos){
        if (qtdVendidos <= quantidade) {
            quantidade -= qtdVendidos;
            System.out.printf("Venda realizada, estoque restante de %s: %d%n", nomeProduto, quantidade);
        } else {
            System.out.println("Estoque insuficiente");
        }
    }
}
