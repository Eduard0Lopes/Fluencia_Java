package POO_Classes_Atributo_Metodo.Exercicios.Exercicio5;

public class Aluno {
    String nome;
    double nota1;
    double nota2;

    public Aluno(String nome, double nota1, double nota2){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public void mostraAluno() {
    double media = (nota1 + nota2) / 2;
        System.out.printf("Aluno: %s - Média: %.1f", nome, media);
        if (media >= 7){
            System.out.println("\nAluno aprovado");
        } else {
            System.out.println("\nAluno reprovado.");
        }
    }
}
