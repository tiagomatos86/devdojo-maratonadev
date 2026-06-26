package academy.devdojo.maratonajava.javacore.ZZBcomportamentos.domain;

public class Motorcycle {
    private String name = "Harley Davidson";
    private String color;
    private int year;

    public Motorcycle(String color, int year) {
        this.color = color;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
}
