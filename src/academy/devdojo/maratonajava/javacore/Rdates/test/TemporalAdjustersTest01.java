package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate data = LocalDate.parse("2025-11-01");
        System.out.println(data);
        data = data.plusDays(2); //adiciona dois dias
        System.out.println(data.getDayOfWeek());
        // problema: o plusDays soma os dias a data, se vc somar dias suficiente para virar o mês ele vira, ex:
        data  = data.plusDays(25);
        System.out.println(data); // vira o mês
        // para alterar o dia numericamente, usa o with (tbm pode alter o ano usando Year no lugar de DayOfMonth ou o mês com o Month
        data = data.withDayOfMonth(5); // agora o dia do mês será 17
        // tbm é possível usar o with + chrono field
        data = data.with(ChronoField.MONTH_OF_YEAR, 12);
        System.out.println(data);

        // como saber quando será um dia da semana em específico usando o temporal adjusters:
        System.out.println(data.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY))); // retorna quando será a próxima sexta ou se hj for sexta, o dia de hj (tbm pode usar o previousOrSame para saber o último dia ou se o dia é hj)
        System.out.println(data.with(TemporalAdjusters.previous(DayOfWeek.SUNDAY))); // retorna quando foi o último domingo
        System.out.println(data.with(TemporalAdjusters.next(DayOfWeek.SUNDAY))); // retorna quando será o próximo domingo
    }
}
