package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.parse("1986-01-03");
        LocalDate date3 = LocalDate.of(2015, Month.JUNE, 4);
        LocalDate date4 = LocalDate.parse("1992-01-29");


        Period p1 = Period.between(date3, date2);
        Period p2 = Period.between(date2, date1);
        Period p3 = Period.between(date3, date1);
        Period p4 = Period.between(date4, date1);
        Period p5 = Period.between(date4, date3);
        System.out.println("Minha idade quando o Erik nasceu: " + p1);
        System.out.println("Minha idade: " + p2);
        System.out.println("Idade do Erik: " + p3);
        System.out.println("Idade da Dominique: " + p4);
        System.out.println("Idade da Dominique quando o Erik nasceu: " + p5);

        Period pDays = Period.ofDays(10); // período de 10 dias
        Period pWeeks = Period.ofWeeks(48);
        Period pMonths = Period.ofMonths(7);
        Period pYears = Period.ofYears(97);

        System.out.println("Periodo em dias: " + pDays);
        System.out.println("Periodo em semanas (retorna em dias): " + pWeeks);
        System.out.println("Periodo em meses: " + pMonths);
        System.out.println("Periodo em anos: " + pYears);
    }
}
