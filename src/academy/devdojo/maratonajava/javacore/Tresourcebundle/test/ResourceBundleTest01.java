package academy.devdojo.maratonajava.javacore.Tresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        boolean sasa = bundle.containsKey("sasa"); //verifica se a chave tem no bundle
        System.out.println(sasa);
        boolean goodMorning = bundle.containsKey("good.morning");
        System.out.println(goodMorning);
        System.out.println(bundle.getString("hello")); //imprime a string dentro da chave
        System.out.println(bundle.getString("good.morning")); //imprime a string dentro da chave

        // usando resource bundle para trocar a mensagem para frances
        bundle = ResourceBundle.getBundle("messages", new Locale("fr", "FR"));
        System.out.println(bundle.getString("hello")); //imprime a string dentro da chave
        System.out.println(bundle.getString("good.morning")); //imprime a string dentro da chave

        // Quando vc não especifica a linguagem, ou a mensagem é a mesma em todas as línguas, pelo fallback a mensagem buscada será a que estiver no messenger.properties
        bundle = ResourceBundle.getBundle("messages", new Locale("jp", "JP"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
        System.out.println(bundle.getString("hi"));


    }

}
