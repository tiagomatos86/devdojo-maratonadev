package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Consumidor;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("A", "Argentina");
        map.put("B", "Brasil");
        map.put("C", "Croácia");
        map.put("E", "Espanha");
        map.put("F", "França");

        for(Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry);
        }

        Consumidor consumidor1 = new Consumidor("Tiago Matos");
        Consumidor consumidor2 = new Consumidor("DevDojo Academy");
        NavigableMap<String, Consumidor> consumidorMap = new TreeMap<>();

        consumidorMap.put("A", consumidor1);
        consumidorMap.put("B", consumidor2);

        for(Map.Entry<String, Consumidor> entry : consumidorMap.entrySet()) {
            System.out.println(entry);
        }

        System.out.println(map.headMap("C")); //retorna todo mundo antes da chave
        System.out.println(map.headMap("C", true)); //retorna todo mundo antes da chave e a própria chave
        //demais métodos semelhantes ao NavigableSet
    }
}
