package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.domain.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime01 = new Anime();
        anime01.setNome("Goblin Slayer");
        anime01.setTipo("Seinen");
        anime01.setEpisodios(12);
        anime01.setAno(2018);
        anime01.imprime();

        Anime anime02 = new Anime();
        anime02.init("Rurouni Kenshin", "Shonen", 24, 2023);
        anime02.imprime();
    }
}
