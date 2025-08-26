package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class A08_ArraysMultidimensionais02 {
    public static void main(String[] args) {
        // outras formas de iniciar matrizes
        int[][] arrayInt = new int[3][]; //cria uma matriz de 3 arrays
        // insere os arrays na matriz
        arrayInt[0] = new int[2];
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[5];

        // inserindo valores nos arrays
        Scanner src = new Scanner(System.in);
        for(int i =0; i < arrayInt.length; i++) {
            for(int j = 0; j < arrayInt[i].length; j++) {
                System.out.println("Entre com o número para ser inserido no array");
                arrayInt[i][j] = src.nextInt();
            }
        }
        src.close();

        // imprimindo valores dos arrays
        for(int[] espacoNaMatriz : arrayInt) {
            for(int vetor : espacoNaMatriz) {
                System.out.println(vetor);
            }
        }

        //iniciando diretamenta a matriz
        String[][] nomes = {
                {"Kenshin", "Yusuke", "Lain"},
                {"Geralt", "Henry", "Kratos"},
                {"Steve", "Peter", "Logan", "Jean"},
        };

        for(String[] arrayNomes : nomes) {
            for(String nome : arrayNomes) System.out.println(nome);
        }
    }
}
