package POO_Classes_Atributo_Metodo.Exercicios.Exercicio2;

public class Principal {

    //Imagine que você está criando um sistema de catalogação para uma biblioteca.
    // Seu objetivo é desenvolver uma estrutura que armazene dados de obras literárias e as exiba em um formato
    // padronizado, facilitando a consulta por outros leitores.
    //
    //Crie um programa que:
    //
    //Defina uma classe com os atributos título, autor e páginas.
    //Implemente um método que use printf para mostrar os dados no formato: "[TÍTULO]" de [AUTOR] com [PÁGINAS] páginas.

    static void main(String[] args) {
        Livro l1 = new Livro("Senhor dos Aneis", "Tolkien", 900);
        l1.mostraLivro();
    }
}
