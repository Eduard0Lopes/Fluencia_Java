package Data_e_Hora.Exercicio3;

import java.time.Duration;
import java.time.LocalTime;

public class Principal {
    static void main(String[] args) {
    LocalTime inicio = LocalTime.of(14, 30, 00);
    LocalTime fim = LocalTime.of(16, 45, 00);

    Duration duracao = Duration.between(inicio, fim);
        System.out.println("Diferença de tempo: " + duracao.toHours() +
                " horas e " + duracao.toMinutesPart() + " minutos");

    }
}
