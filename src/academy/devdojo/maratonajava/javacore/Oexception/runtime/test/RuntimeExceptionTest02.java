package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(divisao(10, 0));
    }
    private static int divisao(int a, int b) {
        // ArithmeticException é uma exceção do tipo runtime, logo, unchecked, mas pode ser tratada se quiser
        try {
            return a/b;
        } catch (RuntimeException e) {
           e.printStackTrace();
        }
        return 0; //forma de não deixar o método sem retorno. Se dividir corretamente, lança o retorno do try, se tentar dividir por 0, lança a stacktrace e retorna 0 pra quem chamou o método
    }
}
