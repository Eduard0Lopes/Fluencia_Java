package Data_e_Hora.Exercicio4;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Principal {
// Você é responsável pelos projetos em uma empresa de desenvolvimento de software. Para garantir que os
// prazos sejam cumpridos, você precisa calcular a data de entrega de cada projeto com base na data de início e no
// prazo estimado em dias.
//
//Você precisa criar um programa que:
//
//Receba uma data de início.
//Adicione o prazo em dias ao início do projeto.
//Exiba a data final formatada corretamente.
//Saída esperada:
//
//Se a data de início for 15 de março de 2025 e o prazo for 15 dias, a saída deve ser:
    static void main(String[] args) {
        LocalDate dataInicio = LocalDate.of(2025, 03, 15);
        int prazo = 15;
        LocalDate prazoEntrega = dataInicio.plusDays(prazo);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = prazoEntrega.format(formatter);

        System.out.println("Data entrega: " + dataFormatada);
    }
}
