package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC127C3", "Iphone");
        Smartphone s2 = new Smartphone("1ABC127C3", "Iphone");
        Smartphone s3 = new Smartphone("1ABC127C5", "Iphone");

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}
