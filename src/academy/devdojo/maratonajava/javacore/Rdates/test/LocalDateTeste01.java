package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class LocalDateTeste01 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2025, Month.NOVEMBER, 25);
        // métodos utilitários do LocalDate
        System.out.println("Ano: " + localDate.getYear());
        System.out.println("Mês: " + localDate.getMonth());
        System.out.println("Mês numérico: " + localDate.getMonthValue());
        System.out.println("Dia da semana: " + localDate.getDayOfWeek());
        System.out.println("Dia do mês: " + localDate.getDayOfMonth());
        System.out.println("Dia do ano: " + localDate.getDayOfYear());
        System.out.println("Quatos dias tem o mês? " + localDate.lengthOfMonth());
        System.out.println("Quatos dias tem o ano (normal ou bissexto)? " + localDate.lengthOfYear());
        System.out.println("Bissexto ou normal? (true ou false) " + localDate.isLeapYear());
        System.out.println("Retornando o ano com temporary fields no método get) " + localDate.get(ChronoField.YEAR));
        //pegando a data atual do sistema
        LocalDate agora = LocalDate.now();
        System.out.println(agora);
        //escolhendo o fuso horário
        LocalDate dataNY = LocalDate.now(ZoneId.of("America/New_York"));
        System.out.println(dataNY);
    }
}
