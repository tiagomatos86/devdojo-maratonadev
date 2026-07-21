package academy.devdojo.maratonajava.javacore.ZZBcomportamentos.interfaces;

import academy.devdojo.maratonajava.javacore.ZZBcomportamentos.domain.Car;

@FunctionalInterface
public interface CarPredicate {
    boolean test(Car car);
}
