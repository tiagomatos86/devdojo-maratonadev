package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.security.UnrecoverableKeyException;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        // NumberFormat é uma classe abastrata e não pode ser instanciada, deve ser pegue com um NumberFormat.getInstance();
        Locale localeUK = new Locale("en", "UK");
        Locale localeJP = Locale.JAPAN;
        Locale localeKO = Locale.KOREA;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[5]; //array de NumberFormat e não instanciacao de objeto
        nfa[0] = NumberFormat.getInstance(); // pega o default do sistema
        nfa[1] = NumberFormat.getInstance(localeUK);
        nfa[2] = NumberFormat.getInstance(localeJP);
        nfa[3] = NumberFormat.getInstance(localeKO);
        nfa[4] = NumberFormat.getInstance(localeIT);

        //valor que será formatado
        double valor = 10_000.2142;

        for (int i = 0; i < nfa.length; i++) {
            System.out.println(nfa[i].format(valor));
        }


    }
}
