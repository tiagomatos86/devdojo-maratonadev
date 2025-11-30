package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest {
    public static void main(String[] args) {
        // semalhante a Date que trabalha com milessegundos desde 1970, a Instant trabalha com nanossegundos
        // A Instant representa um momento exato no tempo, independente de fuso horário.
        // A Instant é moderna e a Date é legado
        Instant now = Instant.now(); // instant é sempre UTC
        System.out.println(now); // imprime data e hora UTC (fuso horário 0)
        System.out.println(LocalDateTime.now()); // diferente do Instant imprimirá a data e hora do sistema
        System.out.println(now.getEpochSecond()); // retorna um long com os segundos desde 1970 (epoch)
        System.out.println(now.getNano()); // retorna um int de nanossegundos do segundo atual
    }


}

