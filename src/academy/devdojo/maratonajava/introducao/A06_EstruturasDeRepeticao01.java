package academy.devdojo.maratonajava.introducao;

public class A06_EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        int count = 0;

        while(count < 10) {
            System.out.println(++count);
        }

        int count2 = 11;
        do {
            System.out.println(count2++);
        } while (count2 <= 20);

        for(int i = 21; i <= 25; i++){
            System.out.println(i);
        }
    }
}
