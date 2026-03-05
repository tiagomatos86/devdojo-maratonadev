package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC127C3", "Iphone 17 pro max");
        Smartphone s2 = new Smartphone("G345939F7", "Samsung Z Flip 7");
        Smartphone s3 = new Smartphone("M45Z82T40", "Moto G75");

        List<Smartphone> smartphones = new ArrayList<>();
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);

        for(Smartphone smartphone : smartphones) {
            System.out.println("Marca: " + smartphone.getMarca());
            System.out.println("Serial Number: " + smartphone.getSerialNumber());
            System.out.println("______________________________________");
        }

        Smartphone s4 = new Smartphone("M45Z82T40", "Moto G75");

        System.out.println(smartphones.contains(s4)); // o método contains compara o hashCode do objeto passado com os demais hashCodes dos objetos na lista para verificar se ele é já existe na lista
        int indexSmartphone4 = smartphones.indexOf(s4);
        System.out.println(smartphones.get(indexSmartphone4));
    }
}
