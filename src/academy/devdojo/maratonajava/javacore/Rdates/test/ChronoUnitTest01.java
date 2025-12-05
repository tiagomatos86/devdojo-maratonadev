package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniversarioErik = LocalDateTime.of(2015, Month.JUNE, 15, 12, 0, 0);
        LocalDateTime meuNiver = LocalDateTime.of(1986, Month.JANUARY, 3, 12, 0, 0);
        LocalDateTime domiNiver = LocalDateTime.of(1992, Month.JANUARY, 29, 12, 0, 0);
        System.out.println(aniversarioErik);
        // retornando em dias o tempo entre duas datas com o chrono unit
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println("Dias desde o nascimento do Erik até hoje: " + ChronoUnit.DAYS.between(aniversarioErik, now));
        System.out.println("Dias entre o meu nascimento até hoje: " + ChronoUnit.DAYS.between(meuNiver, now));
        System.out.println("Dias entre o meu nascimento e o nascimento do Erik: " + ChronoUnit.DAYS.between(meuNiver, aniversarioErik));
        System.out.println("Dias do nascimento da Dominique até hoje: " + ChronoUnit.DAYS.between(domiNiver, now));
        System.out.println("Dias do nascimento da Dominique e o nascimento do Erik: " + ChronoUnit.DAYS.between(domiNiver, aniversarioErik));
        System.out.println();

        System.out.println("Semanas desde o nascimento do Erik até hoje: " + ChronoUnit.WEEKS.between(aniversarioErik, now));
        System.out.println("Semanas entre o meu nascimento até hoje: " + ChronoUnit.WEEKS.between(meuNiver, now));
        System.out.println("Semanas entre o meu nascimento e o nascimento do Erik: " + ChronoUnit.WEEKS.between(meuNiver, aniversarioErik));
        System.out.println("Semanas do nascimento da Dominique até hoje: " + ChronoUnit.WEEKS.between(domiNiver, now));
        System.out.println("Semanas do nascimento da Dominique e o nascimento do Erik: " + ChronoUnit.WEEKS.between(domiNiver, aniversarioErik));
        System.out.println();

        System.out.println("Meses desde o nascimento do Erik até hoje: " + ChronoUnit.MONTHS.between(aniversarioErik, now));
        System.out.println("Meses entre o meu nascimento até hoje: " + ChronoUnit.MONTHS.between(meuNiver, now));
        System.out.println("Meses entre o meu nascimento e o nascimento do Erik: " + ChronoUnit.MONTHS.between(meuNiver, aniversarioErik));
        System.out.println("Meses do nascimento da Dominique até hoje: " + ChronoUnit.MONTHS.between(domiNiver, now));
        System.out.println("Meses do nascimento da Dominique e o nascimento do Erik: " + ChronoUnit.MONTHS.between(domiNiver, aniversarioErik));
        System.out.println();

        System.out.println("Anos desde o nascimento do Erik até hoje: " + ChronoUnit.YEARS.between(aniversarioErik, now));
        System.out.println("Anos entre o meu nascimento até hoje: " + ChronoUnit.YEARS.between(meuNiver, now));
        System.out.println("Anos entre o meu nascimento e o nascimento do Erik: " + ChronoUnit.YEARS.between(meuNiver, aniversarioErik));
        System.out.println("Anos do nascimento da Dominique até hoje: " + ChronoUnit.YEARS.between(domiNiver, now));
        System.out.println("Anos do nascimento da Dominique e o nascimento do Erik: " + ChronoUnit.YEARS.between(domiNiver, aniversarioErik));
        System.out.println();



    }
}
