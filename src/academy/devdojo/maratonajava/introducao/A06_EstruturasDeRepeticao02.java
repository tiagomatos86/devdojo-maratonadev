package academy.devdojo.maratonajava.introducao;

public class A06_EstruturasDeRepeticao02 {
    public static void main(String[] args) {
//        int count = 0;
//        while(count <= 1000000) {
//            int resto = count % 2;
//            if(resto == 0) {
//                System.out.println(count);
//            }
//            count++;
//        }
//
//        do {
//            int resto = count % 2;
//            if(resto == 0) {
//                System.out.println(count);
//            }
//            count++;
//        } while (count <= 1000000);

        for(int i = 0; i <= 1000000; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
