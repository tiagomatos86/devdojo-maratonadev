package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.domain.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        //transformando obj tipo data em string
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        //Transformando String em objeto tipo data
        LocalDate parse1 = LocalDate.parse("20251215", DateTimeFormatter.BASIC_ISO_DATE); //passa a string e o tipo de iso
        LocalDate parse2 = LocalDate.parse("2025-12-15", DateTimeFormatter.ISO_DATE); //passa a string e o tipo de iso
        LocalDate parse3 = LocalDate.parse("2025-12-15", DateTimeFormatter.ISO_LOCAL_DATE); //passa a string e o tipo de iso
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        //Formatando datas do tipo LocalDateTime
        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);

        LocalDateTime parse4 = LocalDateTime.parse("2025-12-16T00:02:07.1893269");
        System.out.println(parse4);

        //formatando em um formato específico
        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dateBR = LocalDate.now().format(formatterBR);
        System.out.println(dateBR);
        LocalDate parseBR = LocalDate.parse("16/12/2025", formatterBR);
        System.out.println(parseBR);

        DateTimeFormatter patternGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        String formatGR = LocalDate.now().format(patternGR);
        System.out.println(formatGR);
        LocalDate parseGR = LocalDate.parse("16.Dezember.2025", patternGR);
        System.out.println(parseGR);
    }
}
