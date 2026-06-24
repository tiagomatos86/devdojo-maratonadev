package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

import org.w3c.dom.ls.LSOutput;

public class OuterClassTest03 {
    private String name = "Messi";
    private int number = 10;
    static class Nested {
        // a classe estática aninhada só poderá acessar diretamente atributos e métodos estáticos da classe externa
        //uma forma de burlar isso é acessando indiretamente instanciando um objeto da classe externa diretamente na classe interna ou passando por parâmetro
        OuterClassTest03 externo = new OuterClassTest03();
        void printName () {
            System.out.println(externo.name);
        }

        // por parâmetro
        void printNumber(OuterClassTest03 externo) {
            System.out.println(externo.number);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();

        nested.printName();
        nested.printNumber(new OuterClassTest03());
    }
}
