package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.domain.*;
import academy.devdojo.maratonajava.javacore.Kenum.domain.Cliente02.TipoPagamento; //Para usar um enum que foi declarado dentro de outra classe ele precisa ser improtado


public class ClinteTeste01 {
    public static void main(String[] args) {
        Cliente cliente01 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA);
        Cliente cliente02 = new Cliente("Gohan", TipoCliente.PESSOA_JURIDICA);
        Cliente02 cliente03 = new Cliente02("Saitama", TipoCliente02.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente02 cliente04 = new Cliente02("Saori", TipoCliente02.PESSOA_JURIDICA, Cliente02.TipoPagamento.CREDITO); // tbm é possível fazer o import assim

        System.out.println(cliente01);
        System.out.println(cliente02);
        System.out.println(cliente03);
        System.out.println(cliente04);
        System.out.println(TipoPagamento02.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento02.CREDITO.calcularDesconto(100));

        System.out.println("Total a pagar: " + (200 - TipoPagamento02.DEBITO.calcularDesconto(200)));

        TipoCliente02 tipoCliente02 = TipoCliente02.tipoCliente02PorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente02);
    }
}
