package POO_Classes_Atributo_Metodo.Exercicios.Exercicio1;

public class Principal {

//Imagine que você é responsável pelo controle de estoque de uma loja de informática que está expandindo
// seus negócios. Com o aumento da demanda, é importante manter um registro organizado e preciso de todos os
// produtos disponíveis. Sua tarefa é criar um sistema que armazene as informações de cada item e gere um
// relatório para facilitar a gestão do estoque.
//
//Sua tarefa é criar uma classe que:
//
//Represente um produto com os atributos nome, preço e quantidade.
//Implemente um método que mostre os dados formatados, garantindo que o preço seja exibido com duas casas decimais.

    static void main(String[] args) {
        Produto produto1 = new Produto("Mouse", 250, 1);
        Produto produto2 = new Produto("Monitor", 850.99, 1);
        Produto produto3 = new Produto("GPU", 3899.99, 1);

        produto1.mostraProduto();
        produto2.mostraProduto();
        produto3.mostraProduto();
    }
}
