package Variaveis_e_Tipos.Exercicios.Exercicio10;

public class Principal {

    // Você está planejando uma viagem de carro e deseja calcular quantos quilômetros poderá percorrer com o
    // combustível disponível no tanque. Para isso, você precisa considerar:
    //
    //O consumo médio do veículo (km/l)
    //A capacidade total do tanque de combustível (litros)
    //A quantidade de combustível disponível no momento (litros)
    //A distância da viagem planejada (km)
    //Com essas informações, o programa deverá calcular:
    //
    //A autonomia máxima do carro (quantos quilômetros pode percorrer com um tanque cheio).
    //A autonomia atual, baseada na quantidade de combustível disponível.
    //Se a quantidade de combustível atual será suficiente para percorrer um determinado trajeto informado pelo usuário.

    static void main() {
        double consumoMedio = 12.5;
        double capacidadeTanque = 50;
        double combustivelAtual = 20;
        double distanciaViagem = 200;

        double autonomiaMax = consumoMedio * capacidadeTanque;
        double autonomiaAtual = consumoMedio * combustivelAtual;

        System.out.println("A autonomia máxima do veiculo: " + autonomiaMax);
        System.out.println("Autonomia atual do veiculo: " + autonomiaAtual);

        if (autonomiaAtual >= distanciaViagem) {
            System.out.println("Pode seguir viagem sem abastecer");
        } else {
            System.out.println("Voce vai precisar abastecer");
        }
    }
}
