package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        /*
            - Checked exceptions: Exceções checadas, filhas diretas da classe exception.
            se não tratadas irão lançar um erro em tempo de compilação (nem compila). São as exceções que serão tratadas.
            - Unchecked exceptions: Exceções não checadas, são do tipo RuntimeException, que é uma subclasse de Exception, ou de subclasses de RunTimeException.
            São exceções em tempo de execução, quase sempre são erros de código mal escrito que provocam os erros. Não tratadas, corrige-se consertando a lógica de programação.
         */

 //       forçando uma RuntimeException do tipo NullPointerException
//        Object object = null;
//        System.out.println(object.toString());

//        exemplo de RuntimeException do tipo ArrayIndexOutOfBoundsException
        int[] nums = {1, 2};
        System.out.println(nums[2]);
    }
}
