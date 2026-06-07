package POO_Classes_Atributo_Metodo.Exercicios.Exercicio3;

public class Conta {
    double saldo;

    public Conta (double saldo) {
        this.saldo = saldo;
    }

    public void exibirSaldo(){
        System.out.printf("%nSeu saldo é de %.2f", saldo);
    }

    public void zerarSaldo(){
        saldo = 0;
    }
}
