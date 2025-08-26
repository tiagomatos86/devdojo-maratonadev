package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTeste05 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        // int[] numeros = {1, 5, 7, 8};
        // calc.somaArray(numeros);

        //outra forma de passar um array
        calc.somaArray(new int[] {1, 2, 3, 4, 5});

        calc.somaVarArgs(1, 5, 7, 8);
    }
}
