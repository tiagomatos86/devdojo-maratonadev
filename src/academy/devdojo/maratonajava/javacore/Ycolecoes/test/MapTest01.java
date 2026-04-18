package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import javax.crypto.spec.PSource;
import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc", "você");
//        map.put("vc", "você2"); //ao tentar incluir um novo elemento e a chave for duplicada, o elemento é substituido pelo novo
        // o putIfAbsent incluí apenas se não existir chave associada no map
        map.putIfAbsent("vc", "você2"); // não sera incluso pois já existe uma chave "vc".
        System.out.println(map);

        // iterando no map: por chave: map.keySet, por valor: map.values
        for(String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

        System.out.println("---------------------");

        for(String value : map.values()) {
            System.out.println(value);
        }

        System.out.println("---------------------");
        // usando o entry para pegar key e value no mesmo for
        for(Map.Entry<String, String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
