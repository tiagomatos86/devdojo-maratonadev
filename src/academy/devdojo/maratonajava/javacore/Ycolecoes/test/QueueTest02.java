package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.MangaByIdCoparator;
import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.MangaByPriceCoparator;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaByPriceCoparator()); // organisza a fila pelo comparator
        mangas.add(new Manga(5L, "Hellsing Ultimate",19.9));
        mangas.add(new Manga(1L, "Berserk", 9.5));
        mangas.add(new Manga(4L,"Pokemon", 3.2));
        mangas.add(new Manga(3L, "Attack on Titan", 11.20 ));
        mangas.add(new Manga(2L, "Dragon Ball Z", 2.99));

        // ao contrário da fila clássica que o primeiro a entrar é o último a sair
        // a fila com prioridade, define uma prioridade (que a passada pelo comparator) e o elemento sai da fila conforme a prioridade estabelecida
        while (!mangas.isEmpty()) {
            System.out.println(mangas.poll());
        }
    }
}
