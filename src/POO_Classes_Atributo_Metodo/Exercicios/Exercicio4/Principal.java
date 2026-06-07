package POO_Classes_Atributo_Metodo.Exercicios.Exercicio4;

public class Principal {

    // Imagine que você faz parte de uma equipe de agricultura tecnológica responsável
    // por monitorar estufas inteligentes. Cada setor possui sensores que coletam dados críticos para o
    // crescimento das plantas. Seu desafio é desenvolver um sistema que não apenas registre a temperatura,
    // mas também alerte quando as condições saírem do ideal, garantindo a saúde das culturas.
    //
    //Crie uma classe que:
    //
    //Possua os atributos local, indicando o setor monitorado, e temperatura atual, armazenando a última medição.
    //Implemente um metodo que mostre:
    //O local do sensor.
    //A temperatura formatada com uma casa decimal.
    //Um alerta se a temperatura ultrapassar 37.5ºC.

    static void main(String[] args) {
        SensorTemperatura s1 = new SensorTemperatura("Laboratorio A", 20);
        s1.exibirRelatorio();
        SensorTemperatura s2 = new SensorTemperatura("Laboratorio B", 38);
        s2.exibirRelatorio();
    }
}
