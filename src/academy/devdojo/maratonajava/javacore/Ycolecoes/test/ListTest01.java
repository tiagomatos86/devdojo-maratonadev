package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List semTipo = new ArrayList(); // Até a versão 1.4
        semTipo.add("String");
        semTipo.add('A');
        semTipo.add(121); // tá aceitando qualquer coisa

        for(Object itemList : semTipo ) {
            System.out.println("Item da Lista: " + itemList);
        }

        // Coma introdução do generics, agora força em tempo de compilação o tipo usando a sintaxe diamond
        List<String> strings = new ArrayList<>();
        strings.add("Tiago");
        strings.add("DevDojo Academy");

        for(String string: strings) {
            System.out.println("String: " + string + " indexOf: " + strings.indexOf(string));
        }

        System.out.println("\n----------Usando o for indexado----------\n");

        for(int i = 0; i < strings.size(); i++) {
            System.out.println("String: " + strings.get(i) + " index: " + strings.indexOf(strings.get(i)));
        }
    }
}
