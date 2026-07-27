package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(Arrays.asList("Natsu", "Alucard"));
        List<Integer> integers = map(strings, (String s) -> s.length());
        System.out.println(integers);
        List<String> uppers = map(strings, s -> s.toUpperCase());
        System.out.println(uppers);
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T e : list) {
            R r = function.apply(e);
            result.add(r);
        }
        return result;
    }
}
