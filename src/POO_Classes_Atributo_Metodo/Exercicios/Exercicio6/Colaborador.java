package POO_Classes_Atributo_Metodo.Exercicios.Exercicio6;

public class Colaborador {
    String nome;
    String cargo;
    int nivelAcessso;

    public Colaborador(String nome, String cargo, int nivelAcessso) {
        this.nome = nome;
        this.cargo = cargo;
        this.nivelAcessso = nivelAcessso;
    }

    public void mostrarColaborador() {
        System.out.printf("%nNome: %s %nCargo: %s %nNivel de Acesso %d %n", nome, cargo, nivelAcessso);
    }

    public void atualizarDados(String novoCargo, int novoNivel) {
        System.out.println("------------- ANTES ------------");
        mostrarColaborador();

        cargo = novoCargo;
        nivelAcessso = novoNivel;

        System.out.println("----------- Atualizado --------");
        mostrarColaborador();
    }
}
