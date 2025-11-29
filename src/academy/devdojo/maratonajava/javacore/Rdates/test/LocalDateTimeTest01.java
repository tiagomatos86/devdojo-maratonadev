package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now(); // pega a hora e a data atual
        System.out.println(localDateTime);
        //possui basicamente todos os métodos de LocalDate e LocalTime ex:
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getYear());

        //testes com LocalDateTime, LocalDate e LocalTime juntos
        LocalDate date = LocalDate.parse("2025-11-27"); // criando uma LocalDate fazendo o parse de String para LocalDate
        LocalTime time = LocalTime.parse("14:25:21"); // criando uma LocalTime fazendo parse de uma string
        System.out.println(date);
        System.out.println(time);
        // fazendo junção de LocalDate e LocalTime para criar um LocalDateTime
        LocalDateTime ldt1 = date.atTime(time);
        LocalDateTime ldt2 = time.atDate(date);
        System.out.println(ldt1);
        System.out.println(ldt2);
    }

}
