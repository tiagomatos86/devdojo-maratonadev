package academy.devdojo.maratonajava.javacore.ZZtestesAleatorios.testecomlistas.domain;

public class Aluno extends Pessoa{
    private String curso;

    public Aluno(String nome, String matricula, String curso) {
        super(nome, matricula);
        this.curso = curso;
    }

    @Override
    public void logar() {
        System.out.println(
                "Aluno: " + this.nome + "\n" +
                "Disciplina: " + this.curso + "\n" +
                "logando no sistema como ALUNO\n"
        );
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" + super.toString() +
                "curso='" + curso + '\'' +
                '}';
    }
}
