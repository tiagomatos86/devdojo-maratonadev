package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.ImpressoraEstudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Shinji Ikari";
        estudante01.idade = 14;
        estudante01.sexo = 'M';

        estudante02.nome = "Asuka Langley Sohryu";
        estudante02.idade = 14;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}
