package academy.devdojo.maratonajava.introducao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class A03_TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Tiago Matos";
        String endereco = "Rua 16, 210-A";
        double salario = 2500.0;
        LocalDate data = LocalDate.of(2025, 04, 02);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = data.format(formato);

        System.out.println("Eu " + nome + " morando no endereço " + endereco + " confirmo que recebi o salário de: " + salario + ", na data de " + dataFormatada);

    }

}
