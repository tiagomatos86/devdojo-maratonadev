package academy.devdojo.maratonajava.javacore.Gassociacao.domain;

public class Escola {
    private String nome;
    private Professor[] professores;

    public void imprime(){
        System.out.println("Nome Da Escola: " + this.nome);
        if(professores != null) {
            System.out.println("Lista de Professores:");
            for(Professor professor : professores) {
                System.out.println(professor.getNome());
            }
        } else {
            System.out.println("Escola sem professores cadastrados");
        }
    }

    public Escola(String nome){
        this.nome = nome;
    }

    public Escola(String nome, Professor[] professores){
        this(nome);
        this.professores = professores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
