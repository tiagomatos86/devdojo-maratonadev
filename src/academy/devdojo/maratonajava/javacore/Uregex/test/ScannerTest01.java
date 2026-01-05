package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Arrays;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Levi, Eren, Mikasa, true, 200";
        //String[] names = texto.split(",\\s*"); //adiciona os nomes em um array de nomes separando por vírgula e retirando os espaços
        String[] names = texto.split(","); // não retira os espaços
        System.out.println(Arrays.toString(names));
        for (String name: names) {
            //System.out.println(name);
            System.out.println(name.trim()); // o trim retira os espaços
        }

    }
}
