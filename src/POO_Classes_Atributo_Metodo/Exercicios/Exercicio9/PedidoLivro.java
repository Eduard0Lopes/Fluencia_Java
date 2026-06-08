package POO_Classes_Atributo_Metodo.Exercicios.Exercicio9;

public class PedidoLivro {
    String titulo;
    int diasAtraso;

    public PedidoLivro(String titulo, int diasAtraso){
        this.titulo = titulo;
        this.diasAtraso = diasAtraso;
    }

    double calcularMulta() {
        return diasAtraso * 2.50;
    }

    void exibirDetalhes(){
        double multa = calcularMulta();
        System.out.printf("Livro: %s | dias em atraso: %d | Multa de R$ %.2f", titulo, diasAtraso, multa);
    }

}
