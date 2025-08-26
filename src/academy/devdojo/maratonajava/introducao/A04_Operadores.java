package academy.devdojo.maratonajava.introducao;

import java.sql.SQLOutput;

public class A04_Operadores {
    public static void main(String[] args) {
        // Operadores Aritiméticos:
        int numero1 = 10;
        int numero2 = 20;
        int subRes = numero1 - numero2;
        int multRes = numero1 * numero2;
        double divRes = numero1/numero2;
        int resto = 21 % 7;

        System.out.println("Resultado: " + (numero1 + numero2));
        System.out.println("SubRes: " + subRes);
        System.out.println("MultRes: " + multRes);
        System.out.println("DivRes: " + divRes);
        System.out.println("Resto Divisão: " + resto);

        // Operadores relacionais
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        boolean isDezMenorQueVinte = 10 < 20;
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        boolean isDezIgualAVinte = 10 == 20;
        System.out.println("isDezIgualAVinte " + isDezIgualAVinte);
        boolean isDezDiferenteDeVinte = 10 != 20;
        System.out.println("isDezDiferenteDeVinte " + isDezDiferenteDeVinte);

        //Operadores lógicos
        int idade = 29;
        float salario = 3500.0f;
        boolean isDentroDaLeiMaiorQueTrinta= idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta= idade < 30 && salario >= 3381;

        System.out.println("Maior que trinta dentro da lei? " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("Menor que trinta dentro da lei? " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        double valorPS5 = 5000;
        boolean isPS5Compravel = valorTotalContaCorrente > valorPS5 || valorTotalContaPoupanca > valorPS5;
        System.out.println("Posso comprar o PS5? " + isPS5Compravel);

        //Operadores de atribuição: = +=, -=, *=, /=, %=
        double bonus = 1800;
        bonus += 1000; // mesmo que bonus = bonus +
        System.out.println(bonus);
        bonus -= 1000;
        System.out.println(bonus);
        bonus *= 2;
        System.out.println(bonus);
        bonus /= 2;
        System.out.println(bonus);
        bonus %=2;
        System.out.println(bonus);

        // incremento e decremento unário
        int contador = 0;
        contador++;
        System.out.println(contador);
        contador--;
        System.out.println(contador);

        //ordem de incremento
        int c = 0;
        System.out.println(c++); //primeiro executa e depois incrementa (resultado será 0)
        System.out.println(++c); // primeiro incrementa depois executa (resultado será  2 pq incrementou na linha anterior e incrementou de novo nessa linha)



    }
}
