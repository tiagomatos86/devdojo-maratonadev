package academy.devdojo.maratonajava.introducao;

public class A07_Arrays01 {
    public static void main(String[] args) {
        int[] idades = new int[3];
        idades[0] = 9;
        idades[1] = 30;
        idades[2] = 39;

        for(int i = 0 ; i < idades.length; i++) {
            System.out.println(idades[i]);
        }

        for(int idade : idades) {
            System.out.println("Idade: " + idade);
        }
    }

}
