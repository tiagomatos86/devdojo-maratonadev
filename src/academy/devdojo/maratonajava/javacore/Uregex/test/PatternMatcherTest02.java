package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        /* Alguns metacaracteres básicos para uso de regex
            *   \d = Retorna todos os dígitos (números)
            *   \D = Retorna tudo que não é dígito
            *   \s = Retorna todos espaços em branco
            *   \S = Retorna tudo que não seja espaço em branco
            *   \w  = Retorna tudo de a-z e A-Z, dígitos e underscore _
            *   \W = Retorna tudo que não está contido no \w
            *   . = Retorna qualquer caractere (exceto quebra de linha)
        */
        String regex = "\\d";
        String regex2 = "\\D";
        String regex3 = "\\s";
        String regex4 = "\\S";
        String regex5 = "\\w";
        String regex6 = "\\W";
        String regex7 = ".";
        String text = "G_u45*%#@87d5_dJkw3250 sfadea23fa T..+=";
        Pattern pattern = Pattern.compile(regex7);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Posicoes encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
    }
}
