package academy.devdojo.maratonajava.javacore.ZZtestesAleatorios.testecomlistas.domain;

public class Professor extends Pessoa{

    private String disciplina;

    public Professor(String nome, String matricula, String disciplina) {
        super(nome, matricula);
        this.disciplina = disciplina;
    }

    @Override
    public void logar() {
        System.out.println(
                "Professor: " + this.nome + "\n" +
                "Disciplina: " + this.disciplina + "\n" +
                "logando no sistema como PROFESSOR\n"
        );
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "Professor{" + super.toString() +
                "disciplina='" + disciplina + '\'' +
                '}';
    }
}
