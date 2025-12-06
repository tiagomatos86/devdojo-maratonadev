package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class VerificaDiaUtil implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        // enhanced switch
        int addDays = switch (dayOfWeek) {
            case THURSDAY -> 4;
            case FRIDAY -> 3;
            case SATURDAY -> 2;
            default -> 1;
        };
        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}

public class TemporalAdjusterTest01 {
    public static void main(String[] args) {
        LocalDate data = LocalDate.now();
        LocalDate data2 = LocalDate.of(2025, Month.NOVEMBER, 30);
        LocalDate data3 = LocalDate.of(2025, Month.DECEMBER, 3);
        LocalDate data4 = LocalDate.of(2025, Month.DECEMBER, 4);

        LocalDate nextBusinessDay = LocalDate.now().with(new VerificaDiaUtil());
        System.out.println(data);
        System.out.println(data.getDayOfWeek());
        System.out.println(nextBusinessDay);
        System.out.println(nextBusinessDay.getDayOfWeek());
        System.out.println();

        nextBusinessDay = data2.with(new VerificaDiaUtil());
        System.out.println(data2);
        System.out.println(data2.getDayOfWeek());
        System.out.println(nextBusinessDay);
        System.out.println(nextBusinessDay.getDayOfWeek());
        System.out.println();

        nextBusinessDay = data3.with(new VerificaDiaUtil());
        System.out.println(data3);
        System.out.println(data3.getDayOfWeek());
        System.out.println(nextBusinessDay);
        System.out.println(nextBusinessDay.getDayOfWeek());
        System.out.println();

        nextBusinessDay = data4.with(new VerificaDiaUtil());
        System.out.println(data4);
        System.out.println(data4.getDayOfWeek());
        System.out.println(nextBusinessDay);
        System.out.println(nextBusinessDay.getDayOfWeek());
        System.out.println();

    }
}
