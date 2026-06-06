package Condicionais_If_Else;

public class Principal {
    static void main() {
        String nome = "Joao";
        double salario = 2890.0;
        int numeroDependentes = 2;
        boolean isento = true;

        if (salario > 2259.20 || !isento) {
            double irrf = salario / 100 * 7.5;
            System.out.println("Valor IRRF: " + irrf);
        } else if (isento){
            System.out.println("Contribuinte isento de IRRF.");
        } else {
            System.out.println("Não há valores de IRRF.");
        }
    }
}
