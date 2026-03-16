package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.MangaByIdCoparator;
import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.MangaByPriceCoparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(7);
        mangas.add(new Manga(5L, "Hellsing Ultimate",19.9));
        mangas.add(new Manga(1L, "Berserk", 9.5));
        mangas.add(new Manga(4L,"Pokemon", 3.2));
        mangas.add(new Manga(3L, "Attack on Titan", 11.20 ));
        mangas.add(new Manga(2L, "Dragon Ball Z", 2.99));

        for(Manga manga : mangas) System.out.println( manga);

        System.out.println("\n----------------------\n");

        Collections.sort(mangas);
        for(Manga manga : mangas) System.out.println( manga);

        System.out.println("\n----------------------\n");

        Collections.sort(mangas, new MangaByIdCoparator());
        for(Manga manga : mangas) System.out.println( manga);

        System.out.println("\n----------------------\n");

        mangas.sort(new MangaByPriceCoparator());
        for(Manga manga : mangas) System.out.println( manga);
    }
}
