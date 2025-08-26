package academy.devdojo.maratonajava.javacore.Dconstrutores.domain;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private int ano;
    private String estudio;

    // permite instanciar um objeto sem passar parâmetros
    public Anime() {}

    public Anime(String nome, String tipo, int episodios, int ano) {
        this(); //chama o construtor default - precisa ser a primeira linha do construtor
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.ano = ano;
    }

    // se durante o projeto um novo atributo for adicionado, ao invés de modificar o construtor, cria-se uma sobrecarga de construtores chamando o antigo e adicionando o novo parâmetro
    public Anime(String nome, String tipo, int episodios, int ano, String estudio) {
        this(nome, tipo, episodios, ano); //chama o construtor que possui os seguintes parametros - precisa ser a primeira linha do construtor
        this.estudio = estudio;
    }

    public void imprime(){
        System.out.println("Infos: ");
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Episódios: " + this.episodios);
        System.out.println("Ano: " + this.ano);
        System.out.println("Estúdio: " + this.estudio);
    }


    //getters & setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodios() {
        return episodios;
    }
    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }


    public String getEstudio() {
        return estudio;
    }
    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

}
