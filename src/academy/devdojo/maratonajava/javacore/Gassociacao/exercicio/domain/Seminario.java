package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.domain;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Aluno[] alunos, Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    public void imprime() {
        System.out.println("----- SEMINÁRIO -----");
        System.out.println("Título: " + this.titulo);
        System.out.println("Local: " + this.local.getEndereco());
        System.out.println("-----Alunos Cadastrados -----");
        if(this.alunos == null) {
            System.out.println("Alunos: Sem Alunos Cadastrados");
        } else {
            for(int i = 0 ; i < this.alunos.length ; i ++) {
                alunos[i].imprime();
            }
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
