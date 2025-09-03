package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        System.out.println(abreConexao());
    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            //throw new RuntimeException(); // exceção lançada para ilustrar como o bloco finally será executado mesmo com a exceção,
            System.out.println("Escrevendo dados no arquivo");
            return "Conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally { // esse bloco sempre será executado independente do que ocorrer dentro do try catch, ocorra exceção ou não
            System.out.println("Fechando recurso liberado pleo SO");
        }
        return null;
    }
}
