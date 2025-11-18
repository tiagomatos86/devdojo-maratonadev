package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date date = c.getTime(); //converte o date do Calendar em um date
        System.out.println(c);
        System.out.println(date);
        if(c.getFirstDayOfWeek() == Calendar.SUNDAY) { //Retorna um inteiro e compara se o primeiro dia é igual a SUNDAY
            System.out.println("Domingo é o primeiro dia da semana");
        } // primeiro dia da
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));

//        c.add(Calendar.DAY_OF_MONTH, 1);
//        System.out.println(c.get(Calendar.DAY_OF_MONTH)); //soma 1 dia ao dia do mês
    }
}

