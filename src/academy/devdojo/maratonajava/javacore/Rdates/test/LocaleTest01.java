package academy.devdojo.maratonajava.javacore.Rdates.test;

import com.sun.security.jgss.GSSUtil;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        // o Locale foi criado para trabalhar com internacionalização
        // Usado para formatar datas, moedas e números baseado nas preferências do usuário ou na localização da JVM do usuário
        // segue o padrão ISO 639 para línguas e ISO 3166 para países ex: pt-BR (pt representa a lingua e BR o país)
        Locale localeItaly = new Locale("it", "IT"); // Italiano da Itália
        Locale localeCH = new Locale("it", "CH");   //Italian da Suiça
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapan = new Locale("ja", "JP");
        Locale localeNetherlands = new Locale("nl", "NL");

        Calendar calendar = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly); // formata o calendário para o padrão Italiano
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH); // formata o calendário para o padrão suiço
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeNetherlands);

        System.out.println("Italy: " + df1.format(calendar.getTime()));
        System.out.println("Switzerland: " + df2.format(calendar.getTime()));
        System.out.println("India: " + df3.format(calendar.getTime()));
        System.out.println("Japan: " + df4.format(calendar.getTime()));
        System.out.println("Netherlands: " + df5.format(calendar.getTime()));

        // Exibe o padrão no idioma do meu sistema
        System.out.println(localeItaly);
        System.out.println(localeCH);
        System.out.println(localeIndia);
        System.out.println(localeJapan);
        System.out.println(localeNetherlands);

        // Exibe o país padrão no idioma do meu sistema
        System.out.println(localeItaly.getDisplayCountry());
        System.out.println(localeCH.getDisplayCountry());
        System.out.println(localeIndia.getDisplayCountry());
        System.out.println(localeJapan.getDisplayCountry());
        System.out.println(localeNetherlands.getDisplayCountry());

        // Exibe no idionma do padrao
        System.out.println(localeItaly.getDisplayCountry(localeItaly));
        System.out.println(localeCH.getDisplayCountry(localeItaly));
        System.out.println(localeIndia.getDisplayCountry(localeIndia));
        System.out.println(localeJapan.getDisplayCountry(localeJapan));
        System.out.println(localeNetherlands.getDisplayCountry(localeNetherlands));
    }
}
