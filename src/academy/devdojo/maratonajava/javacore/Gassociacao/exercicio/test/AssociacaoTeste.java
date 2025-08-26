package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.domain.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.domain.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.domain.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.domain.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua das Laranjeiras, nº 170");
        Aluno aluno = new Aluno("Luffy", 17);
        Professor professor = new Professor("Barba Branca", "Pirata");
        Aluno[] alunos = {aluno};
        Seminario seminario = new Seminario("Onde Achar One Piece",alunos, local);
        Seminario[] seminarios = {seminario};
        professor.setSeminarios(seminarios);

        professor.imprime();


    }
}
