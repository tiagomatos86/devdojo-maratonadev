package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

import academy.devdojo.maratonajava.javacore.ZZAclassesinternas.domain.Animal;

public class AnonymousClassesTest01 {
    // Ela é declarada e instanciada em uma única instrução, permitindo que você crie um objeto que substitui um método ou implementa uma interface na mesma hora em que o instancia.
    // Sao classes de uso único
    public static void main(String[] args) {
        // uma das principais funções de uma classe anônima é a sobreescrita pontual
        // ao invés de criar uma subclasse de animal é escrito uma classe anônima que sobreescreve um metódo apenas uma única vez
        Animal animal = new Animal(){
            @Override //sobreescrita pontual
            public void walk() {
                System.out.println("Animal walking slowly");
            }
        };
        animal.walk();

    }
}
