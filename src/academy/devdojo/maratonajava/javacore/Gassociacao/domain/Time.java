package academy.devdojo.maratonajava.javacore.Gassociacao.domain;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    public Time(String nome){
        this.nome = nome;
    }

    public Time(String nome, Jogador[] jogadores) {
        this(nome);
        this.jogadores = jogadores;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public void imprime(){
        System.out.println("Nome do time: " + this.nome);
        System.out.println("JOGADORES:");
        if(jogadores != null){
            for(Jogador jogador : jogadores) {
                System.out.println(jogador.getNome());
            }
        } else {
            System.out.println("Sem jogadores no time");
        }
    }
}
