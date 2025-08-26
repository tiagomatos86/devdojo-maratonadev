package academy.devdojo.maratonajava.introducao;

import org.w3c.dom.ls.LSOutput;

public class A02_TiposPrimitivos {
    public static void main(String[] args) {
        byte idadeByte = 10; //1 byte: -128 a 127
        short idadeShort = 10; //2 bytes: -32.768 a 32.767
        int idade = 10; // 4 bytes: -2.147.483.648 a 2.147.483.647
        long numeroGrande = 100000; // 8 bytes: -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
        float salarioFloat = 2500.0f; // 4 bytes: ~±1.4E-45 a ±3.4028235E38 (aproximado)
        double salarioDouble = 2000.0; // 8 bytes: ~±4.9E-324 a ±1.7976931348623157E308 (aproximado)
        boolean verdadeiro = true;
        boolean falso = false;
        char caracter = 87; //passa o valor da tabela ASCII referente ao caracter para a variável.

        //String não é um tipo primitivo, é um reference type, uma classe.
        String frase = "Isto é uma string";

        System.out.println("A idade é: " + idade + " anos.");
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println(salarioFloat);
        System.out.println("CHAR: " + caracter); //vai imprimir o caracter específico da tabela ASCII (w) ao invés de 87
        System.out.println("STRING: " + frase);
    }
}
