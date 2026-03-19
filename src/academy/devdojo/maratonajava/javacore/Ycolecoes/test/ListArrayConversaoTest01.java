package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        Integer[] listToArray = numeros.toArray(new Integer[0]); //passa 0 e o java usará o reflections para descobrir o tamanho do array
        System.out.println(Arrays.toString(listToArray));

        Integer[] numerosArray = {1, 2, 3};
        List<Integer> arrayToList = Arrays.asList(numerosArray); //deixa a list linkada ao array, toda modificação na lista, modificará o array, além de não ser possivel adicionar novos elemetos à lista
        System.out.println(arrayToList);

        //forma onde é possível alterar a lista após converter o array
        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArray));
        System.out.println(numerosList);
        numerosList.add(4);
        System.out.println(numerosList);

        // criando listas dessas formas elas ficam estáticas e não permite add
        List<String> frutas = Arrays.asList("Maçã", "Uva", "Tangerina");
        List<String> lutadores = List.of("Poatan", "Jon Jones", "Charles do Bronx", "Topuria");
        System.out.println(frutas);
        System.out.println(lutadores);
    }
}
