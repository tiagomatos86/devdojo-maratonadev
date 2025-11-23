package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args){
        // NumberFormat é uma classe abastrata e não pode ser instanciada, deve ser pegue com um NumberFormat.getInstance();
        Locale localeUK = new Locale("en", "UK");
        Locale localeJP = Locale.JAPAN;
        Locale localeKO = Locale.KOREA;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[5]; //array de NumberFormat e não instanciacao de objeto
        nfa[0] = NumberFormat.getCurrencyInstance(); // pega o default do sistema
        nfa[1] = NumberFormat.getCurrencyInstance(localeUK);
        nfa[2] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[3] = NumberFormat.getCurrencyInstance(localeKO);
        nfa[4] = NumberFormat.getCurrencyInstance(localeIT);

        //valor que será formatado
        double valor = 1_000.2142;

        for (int i = 0; i < nfa.length; i++) {
            System.out.println(nfa[i].getMaximumFractionDigits()); //retorna a quantidade máxima de casas deciamis usadas no padrão, tbm pode ser usado na formatação de números não monetários
            System.out.println(nfa[i].format(valor));
        }

        String valorMoeda = "¤1,000.21";
        try {
            System.out.println(nfa[1].parse(valorMoeda)); //converte o valor em moeda para o valor string
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
