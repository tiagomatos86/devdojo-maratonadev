package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Calculadora;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.test.CalculadoraTeste02;
public class CalculadoraTeste02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;

        calculadora.alteraDoisNumeros(num1, num2);
        // Calculadora.alteraDoisNumeros(num1, num2);
    }
}
