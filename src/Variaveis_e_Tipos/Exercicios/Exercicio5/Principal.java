package Variaveis_e_Tipos.Exercicios.Exercicio5;

public class Principal {
    // Você está iniciando suas atividades como pessoa desenvolvedora e foi designado para criar um programa de
    // cadastro de livros que será escolhida através de um único caractere. O sistema armazenar em variáveis:
    //
    //  Título
    //  Autor
    //  Número de páginas
    //  Preço de um livro
    //  Categoria do livro As categorias disponíveis são:
    //  F - Ficção
    //  N - Não-ficção
    //  T - Tecnologia
    //  H - História
    //  Escreva um programa que armazene em variáveis as informações de um livro e com base na categoria
    //  armazenada exiba uma mensagem de confirmação de acordo com o que foi escolhido.

    static void main() {
        String titulo = "Pequeno Rei";
        String autor = "Alguem";
        int numeroPaginas = 95;
        double precoLivro = 54.98;
        char categoria = 'T';

        String categoriaLivro = "";

        if (categoria == 'F') {
             categoriaLivro = "Ficção";
        } else if (categoria == 'N') {
            categoriaLivro = "Não ficcção";
        } else if (categoria == 'T') {
            categoriaLivro = "Tecnologia";
        } else if (categoria == 'H') {
            categoriaLivro = "História";
        } else {
            System.out.println("Categoria não existe");
        }

        System.out.println("Livro cadastrado: " + titulo + " de " + autor + " ele possui " + numeroPaginas + " paginas e custa R$" +
                precoLivro + " e pertence a categoria " + categoriaLivro);
    }
}
