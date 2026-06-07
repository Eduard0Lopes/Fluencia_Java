package POO_Classes_Atributo_Metodo;

public class Funcionario {
    String nome;
    String cargo;
    double salario;

    public void exibirInformacoes() {
        System.out.printf("Funcionario %s - Cargo: %s - Salario %.2f", nome, cargo, salario);
    }

    public void reajustarSalario(double percentual) {
        salario += salario * (percentual / 100);
        System.out.printf("\nNovo salário de %s é %.2f", nome, salario);
    }
}
