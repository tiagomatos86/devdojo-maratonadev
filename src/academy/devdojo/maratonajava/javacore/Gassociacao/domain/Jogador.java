package academy.devdojo.maratonajava.javacore.Gassociacao.domain;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Time;

public class Jogador {
    private String nome;
    private Time time;

    public Jogador(String nome) {
        this.nome = nome;
    }
    public Jogador(String nome, Time time) {
        this(nome);
        this.time = time;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }
    public void setTime(Time time) {
        this.time = time;
    }

    @Override
    public String toString() {
        String string;
        if(time != null) {
            string = "Jogador{" +
                    "nome='" + nome + '\'' +
                    "time='" + time.getNome() + '\'' +
                    '}';
        } else {
            string = "Jogador{" +
                    "nome='" + nome + '\'' +
                    "time='" + "Sem time" + '\'' +
                    '}';
        }

        return string;
    }
}
