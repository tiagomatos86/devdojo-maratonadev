package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Jogador;

public class JogadorTeste01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Yamal");
        Jogador jogador2 = new Jogador("Mbappé");
        Jogador jogador3 = new Jogador("Haaland");

        Jogador[] jogadores = { jogador1, jogador2, jogador3};

       for(int i = 0; i < jogadores.length; i ++){
           System.out.println(jogadores[i].toString());
       }
    }
}
