package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04EContExercise {
    public static void main(String[] args) {
        // Quantifacadores:
        // ? Zero ou uma ocorrência
        // * Zero ou mais ocorrências
        // + Uma ou mais
        // {n, m} de não até m
        // () agrupamento
        // | ou
        // $ representa o fim da linha
        // \b (em Java) representa um limite de palavra (word boundary), é a posição onde ocorre a transição entre um caracter de palavra e caractere que não é de palavra (ou início/fim da string)
        //Econtrar valores hexadeciamis em um texto
        String regex = "0[xX]([\\da-fA-F])+\\b";
        String text = "O Usuario admin tem id 0x1A3F, token 0xFF09 e acesso nivel B7 no sistema 0x2C 0x10G";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Posicoes encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
    }
}
