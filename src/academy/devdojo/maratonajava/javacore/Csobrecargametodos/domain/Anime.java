package academy.devdojo.maratonajava.javacore.Csobrecargametodos.domain;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private int ano;

    public void init(String nome, String tipo, int episodios, int ano) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.ano = ano;
    }

    // metodo sobrecarregado
    public void init(String nome, int episodios) {
        this.nome = nome;
        this.episodios = episodios;
    }
    public void imprime(){
        System.out.println("Infos: ");
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Episódios: " + this.episodios);
        System.out.println("Ano: " + this.ano);
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

}
