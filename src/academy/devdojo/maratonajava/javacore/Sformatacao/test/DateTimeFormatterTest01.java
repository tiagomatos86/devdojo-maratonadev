package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.domain.Local;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
    }
}
