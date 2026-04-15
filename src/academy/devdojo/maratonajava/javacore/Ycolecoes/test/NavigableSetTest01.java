package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.MangaByIdCoparator;
import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.MangaByPriceCoparator;
import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

// o TreeSet só aceita classes com Comparator, na falta de acesso a classe para criar o Comparator, pode-se criar uma classe de comparação
class SmartphoneMarcaComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);
        System.out.println(set);

//        NavigableSet<Manga> mangas = new TreeSet<>(); // organiza usando o comparator padrão da classe
        NavigableSet<Manga> mangas = new TreeSet<>(new MangaByIdCoparator()); // passa uma classe comparator que compara pela forma desejada (por id no exemplo)
        mangas.add(new Manga(5L, "Hellsing Ultimate",19.9, 0));
        mangas.add(new Manga(1L, "Berserk", 9.5,5));
        mangas.add(new Manga(4L,"Pokemon", 3.2,0));
        mangas.add(new Manga(3L, "Attack on Titan", 11.20,2 ));
        mangas.add(new Manga(2L, "Dragon Ball Z", 2.99,0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
