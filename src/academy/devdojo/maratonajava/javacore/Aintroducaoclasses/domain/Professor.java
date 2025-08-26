package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain;

public class Professor {
    public String nome;
    public int idade;

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo=" + sexo +
                '}';
    }

    public char sexo;
}
