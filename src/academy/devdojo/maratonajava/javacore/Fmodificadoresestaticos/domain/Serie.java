package academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.domain;

public class Serie {
    private String nome;
    private static int[] episodios;

    // bloco de inicialização estático (e todos métodos e atributos estáticos) é executado apenas uma vez qdo a classe é carregada na JVM e seta o array de episódios.
    static {
        System.out.println("Dentro do bloco de inicialização");
        //inciando o array mtos elementos
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Serie(String nome){
        this.nome = nome;
    }

    public Serie(){
        for (int episodio : Serie.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() { return Serie.episodios;}
}
