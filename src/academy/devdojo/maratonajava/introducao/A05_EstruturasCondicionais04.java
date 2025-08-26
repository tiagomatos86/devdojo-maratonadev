package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class A05_EstruturasCondicionais04 {
    public static void main(String[] args) {

        double percentFaixa1 = 9.70;
        double percentFaixa2 = 37.35;
        double percentFaixa3 = 49.50;

        Scanner src = new Scanner(System.in);
        System.out.println("Entre com o seu salário anual: ");
        double salarioAnual = src.nextDouble();
        src.close();

        if(salarioAnual < 34713) {
            System.out.println("Imposto Cobrado Faixa 1: " + (percentFaixa1/100) * salarioAnual);
        } else if (salarioAnual >= 34713 && salarioAnual < 68508) {
            System.out.println("Imposto Cobrado Faixa 2: " + (percentFaixa2/100) * salarioAnual);
        } else if( salarioAnual >= 68508){
            System.out.println("Imposto Cobrado Faixa 3: " + (percentFaixa3/100) * salarioAnual);
        }
    }
}
