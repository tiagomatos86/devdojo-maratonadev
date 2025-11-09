package academy.devdojo.maratonajava.javacore.ZZtestesAleatorios;

public class TabelaASCII {
    public static void main(String[] args) {
        System.out.println("Código ASCII | Caractere");
        System.out.println("-------------------------");

        for (int i = 32; i <= 126; i++) {
            char caractere = (char) i;
            System.out.printf("     %3d     |    %c%n", i, caractere);
        }
    }
}