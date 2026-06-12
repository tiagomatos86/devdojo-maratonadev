package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Animal;
import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Cachorro;
import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Gato;

public class WildcardTest01 {
    public static void main(String[] args) {
        // funciona com arrays
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};
        Animal[] animais = {new Cachorro(), new Gato()};
        printConsulta(cachorros);
        printConsulta(gatos);
        printConsulta(animais);
    }
    private static void printConsulta(Animal[] animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
    }
}
