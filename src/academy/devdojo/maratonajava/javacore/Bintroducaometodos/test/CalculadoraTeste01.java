package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args) {
        //aula01
        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.somaDosiNumeros());
        calculadora.subtraiDoisNumeros();
        //aula02
        calculadora.multiplicaDoisNumeros(7, 2);
        //aula03
        double resultado = calculadora.divideDoisNumeros(21, 3);
        System.out.println(resultado);
        //aula03
        calculadora.divDoisNum(15, 0);
    }
}
