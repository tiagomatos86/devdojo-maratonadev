package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.ImpressoraEstudante;

public class EstudateTeste01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Shinji Ikari";
        estudante01.idade = 14;
        estudante01.sexo = 'M';

        estudante02.nome = "Asuka Langley Sohryu";
        estudante02.idade = 14;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);

//        /*System.out.println(estudante01.nome);
//        System.out.println(estudante01.idade);
//        System.out.println(estudante01.sexo);
//
//        System.out.println("---------------------------");
//
//        System.out.println(estudante02.nome);
//        System.out.println(estudante02.idade);
//        System.out.println(estudante02.sexo);*/

    }
}
