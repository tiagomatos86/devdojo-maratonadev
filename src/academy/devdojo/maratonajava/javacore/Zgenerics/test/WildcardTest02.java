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
        List<Animal> animals = new ArrayList<>();
        printConsultaAnimal(animals);
        printConsultaAnimal(cachorros);

    }

    // upper bounded wildcard - apenas para leitura dos dados
    private static void printConsulta(List< ? extends Animal> animals) { // aceitará qualquer objeto que herde de animal
        for (Animal animal : animals) {
            animal.consulta();
        }
    }

    // lower bounded wildcard - permite escrever/adicionar dados em uma estrutura.
    private static void printConsultaAnimal(List<? super Animal> animals) {
        animals.add(new Cachorro());
        animals.add(new Gato());
    }
}
