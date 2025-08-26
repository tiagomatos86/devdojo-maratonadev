package academy.devdojo.maratonajava.introducao;

public class A08_ArraysMultidimensionais {
    public static void main(String[] args) {
        int[][] mesEdias = new int[3][4];
        mesEdias[0][0] = 31;
        mesEdias[0][1] = 28;
        mesEdias[0][2] = 31;
        mesEdias[0][3] = 30;

        mesEdias[1][0] = 31;
        mesEdias[1][1] = 30;
        mesEdias[1][2] = 31;
        mesEdias[1][3] = 31;

        mesEdias[2][0] = 30;
        mesEdias[2][1] = 31;
        mesEdias[2][2] = 30;
        mesEdias[2][3] = 31;

        for(int i = 0; i < mesEdias.length; i++) {
            for(int j = 0; j < mesEdias[i].length; j ++) {
                System.out.print(mesEdias[i][j] + " ");
            }
        }

        System.out.println("\n----- Com ForEach -----");

        for (int[] mesEdia : mesEdias) {
            for (int dias : mesEdia) {
                System.out.print(dias + " ");
            }
        }
    }
}
