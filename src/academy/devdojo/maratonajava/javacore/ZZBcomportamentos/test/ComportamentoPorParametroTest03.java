package academy.devdojo.maratonajava.javacore.ZZBcomportamentos.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamentos.domain.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamentos.domain.Motorcycle;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {
    private static List<Car> cars = new ArrayList<>(List.of(new Car("green", 2011), new Car("Green", 2007), new Car("black", 1998), new Car("red", 2019)));
    private static List<Motorcycle> bikes = new ArrayList<>(List.of(new Motorcycle("black", 2011), new Motorcycle("black", 2007), new Motorcycle("White", 1998), new Motorcycle("red", 1978)));
    private static List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6,7 ,8, 9, 10);
    public static void main(String[] args) {
        //usando o filtro genérico, consigo com o mesmo método filtrar carros, motos, números ou qualquer coisa
        List<Car> greenCars = filterGeneric(cars, car -> car.getColor().equalsIgnoreCase("green"));
        List<Motorcycle> blackBikes = filterGeneric(bikes, bike -> bike.getColor().equalsIgnoreCase("black"));
        System.out.println(greenCars);
        System.out.println(blackBikes);
        System.out.println("Números pares: " + filterGeneric(numbers, num -> num%2 ==0)); //filtrando direto
    }

    // usando generics para criar uma lista que filtra tudo, não apenas carros
    private static <T>List<T> filterGeneric(List<T> tList, Predicate<T> predicate) {
        List<T> filteredList = tList.stream()
                .filter(e -> predicate.test(e))
                .toList();

        return filteredList;
    }
}

