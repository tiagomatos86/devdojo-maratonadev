package academy.devdojo.maratonajava.javacore.ZZBcomportamentos.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamentos.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car>cars = new ArrayList<>(List.of(new Car("green", 2011), new Car("Green", 2007), new Car("black", 1998), new Car("red", 2019)));

    public static void main(String[] args) {
        System.out.println(cars);
        System.out.println(filterCars(cars, "green"));
        System.out.println(filterCars(cars, 2000));
    }

    private static List<Car> filterCars(List<Car> cars, String color) {
        List<Car> filteredCars  = cars.stream()
                .filter(car -> car.getColor().equalsIgnoreCase(color))
                .toList();

        return filteredCars ;
    }

    private static List<Car> filterCars(List<Car> cars, int year) {
        List<Car> filteredCars  = cars.stream()
                .filter(car -> car.getYear() < year)
                .toList();

        return filteredCars ;
    }
}

