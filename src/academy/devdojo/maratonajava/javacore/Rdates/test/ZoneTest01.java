package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        //maps são coleções de chave e valor:
        Map<String, String> shortIds = ZoneId.SHORT_IDS; //pega as zonas que o Java oferece suporte
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault()); // retorna a zona do sistema
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");

        //uma vez capturada a zona, usando o LocalDateTime para mudar o horário
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        ZonedDateTime tokyoTime = now.atZone(tokyoZone); //cria uma hora zoneada. Usa a hora agora capturada para transformar ela na hora de Tóquio
        System.out.println(tokyoTime); //vai imprimir a hora agora do sistema, mais o UTC da zona, exemplo hora de agora +9 horas, já que o Tóquio usa UTC +9

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);
        ZonedDateTime tokyoZuluTime = nowInstant.atZone(tokyoZone);
        System.out.println(tokyoZuluTime); //o Instant vai imprimir a hora exata que está agora em Tóquio

        // classe ZoneOffset (do pacote java.time) representa um deslocamento fixo em relação ao UTC, ex:
        // UTC+00:00 → ZoneOffset.UTC, UTC−04:00 → ZoneOffset.of("-04:00"), UTC+05:30 → ZoneOffset.of("+05:30")
        // Ela não representa um fuso horário completo, e sim apenas o offset (diferença em horas e minutos em relação ao UTC).
        // Offset: É a diferença entre o horário local e o UTC, por exemplo: Japão: UTC+09:00
        ZoneOffset offsetManaus = ZoneOffset.of("-04:00"); //pq o fuso do Manaus é -04:00
        OffsetDateTime offsetDateTime1 = now.atOffset(offsetManaus);
        System.out.println(offsetDateTime1);
        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(now, offsetManaus);
        System.out.println(offsetDateTime2);
        OffsetDateTime offsetDateTime3 = nowInstant.atOffset(offsetManaus); //usando o instant
        System.out.println(offsetDateTime3);

        // trabalhando com outros tipos de calendario
        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now()); //pega o data atual no nosso calendário e converte em calendario japonês
        System.out.println(japaneseDate);
        LocalDate meijiEraLocalDate = LocalDate.of(1900, 2, 1);
        JapaneseDate meijiEra = JapaneseDate.from(meijiEraLocalDate);
        System.out.println(meijiEra);
    }
}
