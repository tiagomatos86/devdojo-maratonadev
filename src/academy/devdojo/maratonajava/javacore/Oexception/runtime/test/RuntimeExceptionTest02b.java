package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02b {
    public static void main(String[] args) {
        System.out.println(divisao(10, 0));
    }

    private static int divisao(int a, int b) {
        // a forma mais adequada de tratar uma RuntimeException, não é com o try catch, como no exemplo anterior, mas usando o throw
        // Tentar usar sempre a exceção mais especifica, no caso e tentar dividir por 0, é a passagem de um argumento ilegal, então usar a exceção:
        if(b == 0) {
            throw new IllegalArgumentException("Argumento ilegal. Tentando dividir por zero");
        }
        return a/b;
    }
}
