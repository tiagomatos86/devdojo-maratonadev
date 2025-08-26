package academy.devdojo.maratonajava.javacore.Hherenca.test;

import academy.devdojo.maratonajava.javacore.Hherenca.domain.Endereco;
import academy.devdojo.maratonajava.javacore.Hherenca.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.Hherenca.domain.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Endereco endereco01 = new Endereco("Rua 16", "61900-230");
        Pessoa pessoa01 = new Pessoa("Tiago Matos", "010.163.073-57", endereco01);
        Funcionario func01 = new Funcionario("Tiago Matos", "010.163.073-57", endereco01, 3500.50);

//        pessoa01.setNome("Tiago Matos");
//        pessoa01.setCpf("010.163.073-57");
//        pessoa01.setEndereco(endereco01);
        System.out.println(pessoa01.toString());

//        func01.setNome("Tiago Matos");
//        func01.setCpf("010.163.073-57");
//        func01.setEndereco(endereco01);
//        func01.setSalario(3500.50);
        System.out.println(func01.toString());
        func01.relatorioPagamento();

        Pessoa pessoa02 = new Pessoa();
        pessoa02.setNome("José das Couves");
        pessoa02.setCpf("015.167.896-25");
        pessoa02.setEndereco(new Endereco("Rua do Limoeiro, 32", "15254-257"));

        Funcionario func02 = new Funcionario();
        func02.setNome("Ana Banana");
        func02.setCpf("789.354.123-12");
        func02.setEndereco(new Endereco("Rua do Limoeiro, 32", "15254-257"));
        func02.setSalario(2100.00);
        System.out.println(pessoa02.toString());
        System.out.println(func02.toString());

    }
}
