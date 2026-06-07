package POO_Classes_Atributo_Metodo.Exercicios.Exercicio2;

public class Livro {
    String titulo;
    String autor;
    int paginas;

    public Livro (String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void mostraLivro() {
        System.out.printf("%s de %s com %d páginas", titulo, autor, paginas);
    }
}
