package academy.devdojo.maratonajava.introducao;

public class A06_EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        int[] numeros = {10, 1750, 2010, 1984, 78, 2015, 2024};

        for(int numero : numeros) {
            System.out.println(numero);
            if (numero == 2015) break;
        }


    }
}
