package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        // antes do generics o java aceitava qualquer coisa:
        List listaAntiga = new ArrayList();
        listaAntiga.add("Midoriya");
        listaAntiga.add(123L);
        listaAntiga.add(new Consumidor("Son Goku"));

        // isso criava problemas na manipulação dos itens devido aos diversos tipos de dados
        // o uso de generics resolve isso em tempo de compilação

        List <String> listGenerics = new ArrayList<>(); //só irá aceitar Strings
        listGenerics.add("Midoriya");
        listGenerics.add("Kenshin");
        listGenerics.add("Yusuke");
        listGenerics.add("Guts");
//        listGenerics.add(new Consumidor("Son Goku")); // dá erro

        for(String s : listGenerics) {
            System.out.println(s);
        }
    }
}
