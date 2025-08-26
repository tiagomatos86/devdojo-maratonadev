package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class A05_EstruturasCondicionais05 {
    public static void main(String[] args) {
        System.out.println("#### Days Of Week - Consider 1 for Sunday and 7 for Saturday ####" );
        System.out.println("Enter the number that represents the day of the week.");
        Scanner src = new Scanner(System.in);
        int diaNum = src.nextInt();
        src.close();

        switch (diaNum) {
            case 1:
                System.out.println("Sunday (domingo)");
                break;
            case 2:
                System.out.println("Monday (segunda-feira)");
                break;
            case 3:
                System.out.println("Tuesday (terça-feira)");
                break;
            case 4:
                System.out.println("Wednesday (quarta-feira)");
                break;
            case 5:
                System.out.println("Thursday (quinta-feira)");
                break;
            case 6:
                System.out.println("Friday (sexta-feira)");
                break;
            case 7:
                System.out.println("Sunday (sábado)");
                break;
            default:
                System.out.println("Invalid day number");
        }

    }
}
