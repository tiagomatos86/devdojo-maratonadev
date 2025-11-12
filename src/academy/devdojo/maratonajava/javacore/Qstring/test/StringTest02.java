package academy.devdojo.maratonajava.javacore.Qstring.test;

import java.sql.SQLOutput;

public class StringTest02 {
    public static void main(String[] args) {
        //métodos interessantes do String
        String nome = "Zelda";
        String titulo = "The Legend of Zelda";
        System.out.println("Retorna a letra da posicão 0 de " + nome + " = " + nome.charAt(0));
        System.out.println("Retorna o tamanho da String: " + nome.length());
        System.out.println("Troca uma letra da string (Z por X) : " + nome.replace('Z', 'X'));
        System.out.println("Deixando minúsculo: " + nome.toLowerCase());
        System.out.println("Deixando maiúsculo: " + nome.toUpperCase());
        System.out.println("Retorna uma substring delimitada pelos paramâmetros passados: " + nome.substring(0,2)); // a substring começa da posição 0 e vai até 2, mas não imprime o indicie limite, no caso só imprime Z e e
        System.out.println("Usando substring com length(): " + titulo.substring(4, titulo.length())); // retorna toda string começando do indície 4
        System.out.println("Remove os valores em branco no começo e no fim da String");
        String comEspacosEmbraco = "    Super Nintendo Enterteniment System    ";
        System.out.println("Sem o trim: " + comEspacosEmbraco);
        System.out.println("Com o trim: " + comEspacosEmbraco.trim());
    }
}

