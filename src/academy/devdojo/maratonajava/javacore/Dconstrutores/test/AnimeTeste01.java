package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.domain.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime ani01 = new Anime("Shingeki no Kyojin - Season 1", "Shonen",25, 2013, "Wit Studio" );
        ani01.imprime();
    }
}
