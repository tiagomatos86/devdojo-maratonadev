package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> strings = List.of("Tiago", "Erik", "Dominique");
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Consumer<String> stringConsumer= (String s) -> System.out.println(s);
        Consumer<Integer> intConsumer = i -> System.out.println(i);
        printListElements(strings, stringConsumer);
        printListElements(integers, intConsumer);
    }

    private static <T >void printListElements(List<T> list, Consumer<T> consumer) {
        for( T e : list) {
            consumer.accept(e);
        }
    }
}
