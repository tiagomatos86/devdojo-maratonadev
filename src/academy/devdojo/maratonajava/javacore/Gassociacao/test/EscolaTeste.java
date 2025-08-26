package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Professor;

public class EscolaTeste {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Jiraya Sensei");
        Professor prof2 = new Professor("Irineu");
        Professor prof3 = new Professor("Jubileu");
        Professor prof4 = new Professor("Iriscreuza");

        Professor[] professores = {prof1, prof2, prof3, prof4};

        Escola esc1 = new Escola("Liceu Maracanaú", professores);
        Escola esc2 = new Escola("Tenente Mário Lima");

        esc1.imprime();
        esc2.imprime();


    }
}
