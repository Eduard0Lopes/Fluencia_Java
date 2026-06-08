package POO_Classes_Atributo_Metodo.Exercicios.Exercicio6;

public class Principal {

    // Você está desenvolvendo um sistema de controle de colaboradores para uma empresa de tecnologia. Às vezes,
    // é necessário atualizar o cargo e o nível de acesso de um funcionário devido a promoções ou mudanças de
    // departamento. Seu programa deve permitir essas alterações e mostrar as informações atualizadas.
    //
    //  Crie uma classe que:
    //
    // Represente um colaborador com os atributos nome, cargo e nivel de acesso.
    // Implemente um metodo que permita alterar o cargo e o nível de acesso.
    // Exiba no console as informações antes e depois da atualização.

    static void main(String[] args) {
        Colaborador c1 = new Colaborador("Joao", "Desenvolvedor", 3);
        Colaborador c2 = new Colaborador("Ana", "Analista", 2);
        c1.atualizarDados("Desenvolvedor Pleno", 5);
        c2.atualizarDados("Analista Senior", 4);
    }
}
