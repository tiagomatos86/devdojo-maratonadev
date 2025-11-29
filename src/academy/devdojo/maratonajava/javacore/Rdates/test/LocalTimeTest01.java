package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalTime;
import java.time.Month;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime specificTime = LocalTime.of(22, 35, 01); //pega uma hora específica.
        LocalTime timeNow = LocalTime.now(); //pega a hora de agora.

        System.out.println("Specific Time: " + specificTime);
        System.out.println("Time now: " + timeNow); //imprime além de hh:mm:ss tbm os nanosegundos

        // alguns métodos do local time
        System.out.println(timeNow.getHour()); //pega só a hora
        System.out.println(timeNow.getMinute()); // pega só minuto
        System.out.println(timeNow.getSecond()); // pega só segundo
        System.out.println(LocalTime.MIN); // pega a hra mínima do dia (00:00)
        System.out.println(LocalTime.MAX); // pega a hora máxima do dia(23:59:59.999999999)

    }
}
