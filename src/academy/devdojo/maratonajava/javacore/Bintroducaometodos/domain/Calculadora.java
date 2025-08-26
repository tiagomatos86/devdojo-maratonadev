package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class Calculadora {
    public int somaDosiNumeros() {
        return 10 + 10;
    }
    public void subtraiDoisNumeros() {
        System.out.println(somaDosiNumeros() -1 );
    }

    public void multiplicaDoisNumeros(int a, int b) {
        System.out.println(a * b);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if(num2 == 0) {
            return 0;
        } else {
            return num1 / num2;
        }
    }

    public void divDoisNum(double a, double b) {
        if(b == 0) {
            return; // pode ser usado dentro de um métdo void e funcionará como um break para interromper a execução.
        } else {
            System.out.println(a/b);
        }
    }

    public void alteraDoisNumeros(int numero1, int numero2){
        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1: " + numero1);
        System.out.println("Num2: " + numero2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for(int numero : numeros) {
            soma += numero;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for(int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        System.out.println(soma);
    }
}
