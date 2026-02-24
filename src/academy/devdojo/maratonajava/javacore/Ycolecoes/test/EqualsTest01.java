package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC127C3", "Iphone");
        Smartphone s2 = new Smartphone("1ABC127C3", "Iphone");

        System.out.println(s1.equals(s2)); // retorna false pq o equals default, que herda de Object, compara que se as duas referências apontam pro mesmo objeto em memória e não se tem os mesmos atributos.
    }
}
