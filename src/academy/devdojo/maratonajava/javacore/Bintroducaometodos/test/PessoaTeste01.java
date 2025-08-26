package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
//        pessoa.nome = "Jiraya";
//        pessoa.idade = 70;

        pessoa.setNome("Jiraya");
        pessoa.setIdade(-1);

        pessoa2.setNome("Kenshin");
        pessoa2.setIdade(28);

        pessoa.imprime();

        System.out.println(pessoa2.getNome());
        System.out.println(pessoa2.getIdade());
    }
}
