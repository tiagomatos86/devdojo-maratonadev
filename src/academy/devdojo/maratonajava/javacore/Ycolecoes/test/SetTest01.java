package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
//        Set<Manga> mangasSet = new HashSet<>();
        Set<Manga> mangasSet = new LinkedHashSet<>(); // mantem a orde de inserção
        mangasSet.add(new Manga(5L, "Hellsing Ultimate",19.9, 0));
        mangasSet.add(new Manga(1L, "Berserk", 9.5,5));
        mangasSet.add(new Manga(4L,"Pokemon", 3.2,0));
        mangasSet.add(new Manga(3L, "Attack on Titan", 11.20,2 ));
        mangasSet.add(new Manga(2L, "Dragon Ball Z", 2.99,0));
        mangasSet.add(new Manga(2L, "Dragon Ball Z", 2.99,0)); // não é add pois o set não permite elementos duplicados

        for (Manga manga : mangasSet) {
            System.out.println(manga);
        }
    }
}
