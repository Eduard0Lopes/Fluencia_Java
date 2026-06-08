package Data_e_Hora.Exercicio2;

import java.text.Format;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Principal{

    // Você trabalha no setor de tecnologia de uma empresa que gera relatórios diários.
    // Esses relatórios incluem informações como transações realizadas, atualizações de pedidos e registros
    // de atendimento ao cliente. A equipe responsável pela análise dos relatórios solicitou que a data e a hora
    // sejam exibidas em um formato mais familiar para os usuários brasileiros.
    //
    //Para resolver essa tarefa, você deve:
    //
    //Capturar a data e a hora atuais.
    //Formatar a data no padrão dd-MM-yyyy (dia-mês-ano).
    //Formatar a hora no padrão HH:mm (hora e minutos).
    //Exibir o resultado da formatação.

    static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        LocalTime horaAtual = LocalTime.now();

        DateTimeFormatter formata = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data formatada: " + dataAtual.format(formata));

        DateTimeFormatter formataHora = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println("Hora formatada: " + horaAtual.format(formataHora));
    }
}
