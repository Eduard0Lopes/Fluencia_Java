package POO_Classes_Atributo_Metodo.Exercicios.Exercicio7;

public class Tarefa {
    String descricao;
    boolean concluida;

    public Tarefa(String descricao, boolean concluida){
        this.descricao = descricao;
        this.concluida = concluida;
    }

    void exibir(){
        if(concluida == false) {
            System.out.println("Tarefa: " + descricao + " em andamento");
        } else {
            System.out.println("Tarefa: " + descricao + " concluida.");
        }
    }
}
