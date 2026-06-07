package POO_Classes_Atributo_Metodo.Exercicios.Exercicio4;

public class SensorTemperatura {
    String local;
    double temperatura;

    public SensorTemperatura(String local, double temperatura){
        this.local = local;
        this.temperatura = temperatura;
    }

    public void exibirRelatorio(){
        System.out.printf("Local: %s - Temperatura: %.1f", local, temperatura);

        if (temperatura > 37.5) {
            System.out.printf("%nLocal: %s - Temperatura CRITICA de %.1f", local, temperatura);
        }
    }
}
