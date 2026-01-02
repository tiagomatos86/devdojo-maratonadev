package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03Exercise {
    public static void main(String[] args) {
        //Econtrar valores hexadeciamis em um texto
        String regex = "0[xX][\\da-fA-F]"; // procura os caracteres abc idependnete de como aparecem na string (case sensitive)
        String text = "O Usuario admin tem id 0x1A3F, token 0xFF09 e acesso nivel B7 no sistema 0x2C";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Posicoes encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
    }
}
