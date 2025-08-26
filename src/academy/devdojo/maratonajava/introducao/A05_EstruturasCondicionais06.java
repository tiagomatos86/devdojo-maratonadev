package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class A05_EstruturasCondicionais06 {
    public static void main(String[] args) {
        System.out.println("Entre com o dia da semana considerando 1 para Domingo e 7 para Sábado: ");
        Scanner src = new Scanner(System.in);
        int dia = src.nextInt();
        src.close();

        switch (dia) {
            case 1:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            case 7:
                System.out.println("Final de semana");
            default:
                System.out.println("O número digitado não representa nenhum dia da semana");
        }
    }
}
