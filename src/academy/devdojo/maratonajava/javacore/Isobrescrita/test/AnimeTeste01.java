package academy.devdojo.maratonajava.javacore.Isobrescrita.test;

import academy.devdojo.maratonajava.javacore.Isobrescrita.domain.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Dr. Stone");

        System.out.println(anime); //chama automaticamente o toString
    }
}
