package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.domain.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;
import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodReferencTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = Arrays.asList(new Anime("Berserk", 43),
                new Anime("One Piece", 900),
                new Anime("Naruto", 500),
                new Anime("Attack On Titan", 97));

//        Collections.sort(animeList, (a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
        Collections.sort(animeList, (a1, a2) ->AnimeComparators.compareByTitle(a1, a2));
        System.out.println(animeList);

        Collections.sort(animeList, AnimeComparators::compareByEpisodes);
        System.out.println(animeList);
    }
}
