package academy.devdojo.maratonajava.javacore.Ycolecoes.domain;

import java.util.Comparator;

public class MangaByPriceCoparator implements Comparator<Manga> {

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return Double.compare(manga1.getPreco(), manga2.getPreco());
    }
}
