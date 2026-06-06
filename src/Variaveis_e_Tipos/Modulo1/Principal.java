package Variaveis_e_Tipos.Modulo1;

public class Principal {
    static void main(String[] args) {
        int quantidadePassos = 500;
        double alturaEmMetros = 1.60;
        String nome = "Jose";

        int alturaEmCentimetros = 170;
        alturaEmMetros = alturaEmCentimetros;
        System.out.println(alturaEmMetros / 100);

        if (quantidadePassos < 1000) {
            String sugestao = "Sugiro que voce tente aumentar a meta";
            System.out.println(sugestao);
        }
    }
}
