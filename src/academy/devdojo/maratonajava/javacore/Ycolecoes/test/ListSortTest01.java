package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(7);
        mangas.add("Berserk");
        mangas.add("Hellsing Ultimate");
        mangas.add("Pokemon");
        mangas.add("Attack on Titan");
        mangas.add("Dragon Ball Z");

        Collections.sort(mangas); //organiza em ordem alfabética por trabalhar com Strings, números seria em ordem numérica, porém só deve usada assim em tipos próprios do java (String, Double, Integer e etc) pois já tem a interface Comparable implementada, em classes próprias é preciso fazer um procedimento diferente

        for (String manga : mangas) {
            System.out.println(manga);
        }

        List<Double> notas = new ArrayList<>();
        notas.add(7.5);
        notas.add(10.0);
        notas.add(9.0);
        notas.add(5.0);

        Collections.sort(notas);
        System.out.println(notas);

        Collections.sort(notas, Collections.reverseOrder()); //ordena em ordem decrescente
        System.out.println(notas);
    }
}
