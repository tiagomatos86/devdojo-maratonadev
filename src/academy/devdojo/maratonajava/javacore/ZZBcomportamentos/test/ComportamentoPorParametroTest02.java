package academy.devdojo.maratonajava.javacore.ZZBcomportamentos.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamentos.domain.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamentos.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest02 {
    private static List<Car> cars = new ArrayList<>(List.of(new Car("green", 2011), new Car("Green", 2007), new Car("black", 1998), new Car("red", 2019)));

    public static void main(String[] args) {
        //cria uma classe anônima para testar
        List<Car> greenCars = filterCars(cars, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equalsIgnoreCase("green");
            }
        });
        System.out.println(greenCars);

        // usando lambda
        List<Car> oldCars = filterCars2(cars, car -> car.getYear() < 2000);
        System.out.println(oldCars);
    }

    private static List<Car> filterCars(List<Car> cars, CarPredicate carPredicate) {
        List<Car> filteredCars  = cars.stream()
                .filter(car -> carPredicate.test(car))
                .toList();

        return filteredCars ;
    }

    // não é necessário criar uma interface predicate, já existe uma no próprio java que usa generics
    // usando generics
    private static List<Car> filterCars2(List<Car> cars, Predicate<Car> predicate) {
        List<Car> filteredCars  = cars.stream()
                .filter(car -> predicate.test(car))
                .toList();

        return filteredCars ;
    }


}

