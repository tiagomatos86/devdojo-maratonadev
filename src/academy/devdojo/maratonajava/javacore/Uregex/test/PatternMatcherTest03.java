package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        /* Alguns metacaracteres básicos para uso de regex
            *   \d = Retorna todos os dígitos (números)
            *   \D = Retorna tudo que não é dígito
            *   \s = Retorna todos espaços em branco
            *   \S = Retorna tudo que não seja espaço em branco
            *   \w  = Retorna tudo de a-z e A-Z, dígitos e underscore _
            *   \W = Retorna tudo que não está contido no \w
            *   . = Retorna qualquer caractere (exceto quebra de linha)
            *   [] = Range de caracteres
        */
        String regex = "[abcABC]"; // procura os caracteres abc idependnete de como aparecem na string (case sensitive)
        String regex2 = "[a-zA-C]"; // procura os caracteres a-z minusculos e de A-C maiusculos
        String text = "cafeBACED";
        Pattern pattern = Pattern.compile(regex2);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Posicoes encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }

    }
}
