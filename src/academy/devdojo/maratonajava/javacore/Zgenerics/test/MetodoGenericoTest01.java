package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Barco;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        criarArrayComUmObjeto(new Barco("Iate"));
    }

    // método genérico
    private static <T> void criarArrayComUmObjeto(T t) {
        List<T> list = List.of(t);
        System.out.println(list);
    }
}

