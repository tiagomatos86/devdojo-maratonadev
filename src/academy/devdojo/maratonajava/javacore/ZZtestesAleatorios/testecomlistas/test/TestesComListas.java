package academy.devdojo.maratonajava.javacore.ZZtestesAleatorios.testecomlistas.test;

import academy.devdojo.maratonajava.javacore.ZZtestesAleatorios.testecomlistas.domain.Aluno;
import academy.devdojo.maratonajava.javacore.ZZtestesAleatorios.testecomlistas.domain.Pessoa;
import academy.devdojo.maratonajava.javacore.ZZtestesAleatorios.testecomlistas.domain.Professor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestesComListas {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        pessoas.add(new Aluno("Tiago Matos", "2003002022", "Java"));
        pessoas.add(new Aluno("Ana Quinn", "2010302257", "React"));
        pessoas.add(new Aluno("José Paulo", "2025302489", "React"));
        pessoas.add(new Aluno("Patricia Souza", "2025789123", "Java"));
        pessoas.add(new Aluno("João", "2005001023", "Java"));

        pessoas.add(new Professor("Jean Marcelo", "2000459785", "POO"));
        pessoas.add(new Professor("Daniel Silva", "2001963789", "HTML e CSSS"));
        pessoas.add(new Professor("Loiane Groner", "2009452831", "Spring"));
        pessoas.add(new Professor("Maik Costa", "2022985753", "JavaScript"));
        pessoas.add(new Professor("Siqueira", "2000712255", "Banco de Dados"));

        System.out.println("Alunos logando no sistema: ");
        System.out.println(" ");
        for(Pessoa pessoa : pessoas) {
            if(pessoa instanceof Aluno) {
                pessoa.logar();
            }
        }

        System.out.println("Professores logando no sistema: ");
        System.out.println(" ");
        for(Pessoa pessoa : pessoas) {

            if(pessoa instanceof Professor) {
                pessoa.logar();
            }
        }

         List<Aluno> alunosJava = pessoas.stream()
                 .filter(pessoa -> pessoa instanceof Aluno)
                 .map(p -> (Aluno) p)
                 .filter(p -> "Java".equalsIgnoreCase(p.getCurso()))
                 .toList();

         List<Aluno> alunoReact = pessoas.stream()
                 .filter(p -> p instanceof Aluno)
                 .map(aluno -> (Aluno) aluno)
                 .filter(aluno -> aluno.getCurso().equalsIgnoreCase("react"))
                 .toList();

         for(Aluno aluno : alunosJava) {
             System.out.println(aluno);
         }

           for(Aluno aluno : alunoReact) {
             System.out.println(aluno);
         }

    }
}
