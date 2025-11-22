package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import javax.swing.text.html.HTMLDocument;
import java.util.Locale;

public class LocalTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault()); // mostra configuração do SSO
        String[] isoCoutries = Locale.getISOCountries(); // pega a iso de todos países suportados
        String[] isoLanguages = Locale.getISOLanguages(); // pega iso de todas as linguas suportadas
        for (String country : isoCoutries) {
            System.out.println(country);
        }

        for (String languages : isoLanguages) {
            System.out.println(languages);
        }



    }
}
