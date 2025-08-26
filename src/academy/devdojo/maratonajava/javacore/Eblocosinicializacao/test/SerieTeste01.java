package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.test;

import academy.devdojo.maratonajava.javacore.Eblocosinicializacao.domain.Serie;

public class SerieTeste01 {
    public static void main(String[] args) {
        Serie serie = new Serie();
        Serie serie2 = new Serie("Game Of Thrones");
        Serie serie3 = new Serie("Shogun", new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});


        System.out.println("#### Série 1 #####");
        System.out.println(serie.getNome());
        for (int episodio : serie.getEpisodios()) {
            System.out.print(episodio + " ");
        }
        System.out.println(" ");

        System.out.println("#### Série 2 #####");
        System.out.println(serie2.getNome());
        for (int episodio : serie2.getEpisodios()) {
            System.out.print(episodio + " ");
        }
        System.out.println(" ");

        System.out.println("#### Série 3 #####");
        System.out.println(serie3.getNome());
        for (int episodio : serie3.getEpisodios()) {
            System.out.print(episodio + " ");
        }
    }
}
