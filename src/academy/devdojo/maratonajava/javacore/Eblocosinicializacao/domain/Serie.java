package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.domain;

public class Serie {
    private String nome;
    private int[] episodios;

    /*  Como ocorre a instanciação de um objeto:
        *  0 - Bloco de incialização estático é executado quando a JVM carregar a classe
        *  1 - Alocado espaço em memória para o objeto.
        *  2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado.
        *  3 - Bloco de inicialização é executado.
        *  4 - Construtor é executado.
        *
        *  obs: Em relacionamento de herença, a ordem é: bloco estático do pai, bloco estático da filha, bloco de incialização do pai, bloco de inicialização da filha, contrutores do pai, construtores da filha.
     */
    //bloco de inicialização : será ininicado toda vez que uma instância for criada e é executada antes do construtor
    {
        System.out.println("Dentro do bloco de inicialização");
        //inciando o array mtos elementos
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Serie(){}

    public Serie(String nome){
        this.nome = nome;
    }

    public Serie(String nome, int[] episodios) {
        this(nome);
        this.episodios = episodios;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }
}
