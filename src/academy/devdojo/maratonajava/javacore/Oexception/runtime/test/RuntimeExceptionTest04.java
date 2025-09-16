package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        // para tratar múltiplas exceções, usa-se múltiplos catchs
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IllegalArgumentException e ) {
            System.out.println("Dentro do IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("Dentro de ArithmeticException");
        } catch (RuntimeException e) { // o tipo mais genérico deve ser a última a tentar ser capturada (todas as outras acima sao filhas de RuntimeException)
            System.out.println("Dentro de RuntimeException");
        }
    }

}
