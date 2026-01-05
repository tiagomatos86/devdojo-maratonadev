package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String texto = "Levi,Eren,Mikasa,true,200";
        Scanner scn = new Scanner(texto); //O delimitador padrão da classe Scanner é o espaço em branco
        scn.useDelimiter(","); //modifica o delimitador padrão para o delimitador desejado
//        while (scn.hasNext()) {
//            System.out.println(scn.next());
//        }

        // usando o Scanner para pegar por tipo específico
        while(scn.hasNext()) {
            if(scn.hasNextInt()) {
                int i = scn.nextInt();
                System.out.println("Integer: " + i);
            } else if (scn.hasNextBoolean()) {
                boolean b = scn.nextBoolean();
                System.out.println("Boolean: " + b);
            } else {
                System.out.println(scn.next());
            }
        }
    }
}
