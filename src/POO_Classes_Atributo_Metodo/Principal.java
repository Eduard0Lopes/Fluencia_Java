package POO_Classes_Atributo_Metodo;

public class Principal {
    static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        funcionario1.nome = "Ana";
        funcionario1.cargo = "Gerente de Projeto";
        funcionario1.salario = 9000;

        Funcionario funcionario2 = new Funcionario();
        funcionario2.nome = "João";
        funcionario2.cargo = "Desenvolvedor";
        funcionario2.salario = 8500;

        funcionario2.exibirInformacoes();
        funcionario2.reajustarSalario(5);
    }
}
