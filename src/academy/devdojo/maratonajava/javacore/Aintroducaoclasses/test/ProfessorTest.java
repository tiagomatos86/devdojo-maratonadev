package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof1 = new Professor();

        prof1.nome = "Genkai";
        prof1.idade = 70;
        prof1.sexo = 'F';

        System.out.println("Nome: " + prof1.nome + ", idade: " + prof1.idade + ", sexo: " + prof1.sexo);
        System.out.println(prof1.toString());
    }
}
