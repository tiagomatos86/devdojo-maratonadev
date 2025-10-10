package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.Oexception.exception.domain.Pessoa;

public class SobrescritaComExceptionTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        /*
            Ao sobreescrever vc pode lançar no método sobreescrito:
            Todas exceções do método original
            Apenas uma exceção
            Nenhuma exceção
            Uma exceção do mesmo tipo, filhas de runtime
            Não pode lançar exceções mais genéricas ou de outro tipo como checked.
         */

        funcionario.salvar();
    }
}
