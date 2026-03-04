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

        // quando for necessário adicionar intens dentro de uma list pelo for, não usar o foreach mas o for indexado ou iterator
        // porém é preciso ter cuidado ao adicionar novos elementos usando o for para não gerar looping infinito de adicões dvido ao "nomeLista.size()"
        // a seguinte estratégia é válida, porém não é uma boa prática mexer no tamanho da lista dentro de um for
        int sizeList = strings.size(); // passa o tamanho atual da list pra uma váriavel
        for (int i = 0; i < sizeList; i++) { // usa o tamanho anterior a adição evitando looping infinito
            strings.add("Matos");
            System.out.println("String: " + strings.get(i) + " index: " + strings.indexOf(strings.get(i)));
        }
        System.out.println(strings);
        // o método remove das listas pode remover tanto pelo indice quanto passando um objeto utilizando equals
        strings.remove(3);
        strings.remove("DevDojo Academy");
        System.out.println(strings);

        // Não é possível criar lista de tipos primitivos (int, double e char etc, apenas objetos e wrappers)
        List<Double> notas = new ArrayList<>();
        notas.add(7.5);
        notas.add(10.0);
        System.out.println(notas);

        List<Double> notas2 = new ArrayList<>();
        notas2.add(9.0);
        notas2.add(5.0);
        System.out.println(notas2);
        notas.addAll(notas2); // adiciona todos da notas2 em notas
        System.out.println(notas);
        //



    }
}
