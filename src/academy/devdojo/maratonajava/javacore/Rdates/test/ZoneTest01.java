package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.ZoneId;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        //maps são coleções de chave e valor:
        Map<String, String> shortIds = ZoneId.SHORT_IDS; //pega as zonas que o Java oferece suporte
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault()); // retorna a zona do sistema
    }
}
