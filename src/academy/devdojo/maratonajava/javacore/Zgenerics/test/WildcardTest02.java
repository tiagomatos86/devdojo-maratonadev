package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Animal;
import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Cachorro;
import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Gato;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildcardTest02 {
    public static void main(String[] args) {
        // o que foi feito no exemplo anterior, não funciona em listas
        // para o uso em listas é preciso usar os wildcars:
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = Arrays.asList(new Gato(), new Gato());
        printConsulta(cachorros);
        printConsulta(gatos);

    }
    private static void printConsulta(List<Animal> animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
    }
}
