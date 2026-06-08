package Data_e_Hora.Exercicio5;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Principal {
    // Você trabalha no setor financeiro de uma empresa de serviços e é responsável por gerenciar o
    // vencimento das faturas dos clientes. Em alguns casos, os clientes solicitam um adiamento da data de pagamento,
    // e o sistema precisa calcular a nova data de vencimento com base na quantidade de meses adicionados.
    //
    //Crie um programa que:
    //
    //Receba uma data de vencimento original.
    //Adicione um número de meses ao vencimento.
    //A data ajustada deve ser exibida no formato dd-MM-yyyy.

    static void main(String[] args) {
        LocalDate vencimento = LocalDate.of(2025, 03, 20);
        int adiantamento = 1;
        LocalDate novaDataVencimento = vencimento.plusMonths(adiantamento);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = novaDataVencimento.format(formatter);

        System.out.println("Nova data vencimento " + dataFormatada);
    }
}
