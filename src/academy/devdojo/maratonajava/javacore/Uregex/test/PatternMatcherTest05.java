package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
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
             *  Quantifacadores:
             *  ? Zero ou uma ocorrência
             *  * Zero ou mais ocorrências
             *  + Uma ou mais
             *  {n, m} de não até m
             *  () agrupamento
             *  | ou
             *  $ representa o fim da linha
             *  \b (em Java) representa um limite de palavra (word boundary), é a posição onde ocorre a transição entre um caracter de palavra e caractere que não é de palavra (ou início/fim da string)
             *  ^ fora de colchetes → início da string (ou linha) Quando usado fora de [], o ^ é um âncora (anchor). Dentro dos colchetes negação. Quando aparece logo após [, o ^ inverte o conjunto.
         */

        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String text = "urameshi-yusuke@hotmail.com, 123kenshin@gmail.com, #@!ayase_momo@yahoo.com.jp, asuka@mail.jp, teste@mail";
        System.out.print("e-mail válido: ");
        System.out.println("#@!ayase_momo@yahoo.com.jp".matches(regex)); //verifica se a string está de acordo com a expressão regular (valida)
        System.out.println(Arrays.toString(text.split(","))); // O split divide a string por um delimitador e retorna um array de Strings
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Posicoes encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
    }
}
