package Data_e_Hora;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Principal {
    static void main(String[] args) {
    LocalDate dataCompra = LocalDate.now();
    LocalDate dataPrimeiraParcela = LocalDate.of(2026, 06, 8);
    LocalDate dataSegundaParcela = dataPrimeiraParcela.plusDays(30);


    if (dataPrimeiraParcela.isEqual(LocalDate.now())){
        System.out.println("Hoje vence sua parcela");
    } else {
        System.out.println("Ainda nao esta vencendo");
    }

        System.out.println("Data compra: " + dataCompra);
        System.out.println("Data Primeira Parcela: " + dataPrimeiraParcela);
        System.out.println("Data Segunda Parcela: " + dataSegundaParcela);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data formatada: " + dataCompra.format(formato));

        ZonedDateTime dataConclusaoCompra = ZonedDateTime.now();
        ZonedDateTime dataCompraNY = dataConclusaoCompra.withZoneSameInstant(ZoneId.of("America/New_York") );
        System.out.println("Data formatada ZONED: " + dataConclusaoCompra);
        System.out.println("Data formatada ZONED: " + dataCompraNY);


        LocalTime inicio = LocalTime.of(9, 0);
        LocalTime fim = LocalTime.of(17, 30);
        Duration duracao = Duration.between(inicio, fim);
        System.out.println("Duracao expediente: " + duracao.toHours() + " horas e " +
                duracao.toMinutesPart() + " minutos.");
        LocalDate dataPagamento = LocalDate.parse("2025-10-30");
        Period periodo = Period.between(dataCompra, dataPagamento);
        System.out.println("Diferenca em dias: " + periodo.getDays());


    }
}
