package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>();
        fila.add("Croatia");
        fila.add("Brazil");
        fila.add("Austria");
        fila.add("Denmark");

        for( String s : fila) {
            System.out.println(s);
        }
        System.out.println(fila);

        while(!fila.isEmpty()) {
            System.out.println(fila.poll());
        }

    }
}
