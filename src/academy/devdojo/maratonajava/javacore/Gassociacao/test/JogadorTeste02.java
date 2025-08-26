package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Lucas Moura");
        Jogador jogador2 = new Jogador("Oscar");
        Jogador jogador3 = new Jogador("Rafael");
        Jogador jogador4 = new Jogador("Willian Arão");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        Time time1 = new Time("SPFC");
        time1.setJogadores(jogadores);

        Time time2 = new Time("Santos");

        for (Jogador jogador : jogadores) {
            jogador.setTime(time1);
        }

        time1.imprime();
        time2.imprime();

        System.out.println(jogador1);
        System.out.println(jogador2);
        System.out.println(jogador3);
        System.out.println(jogador4);

    }
}
