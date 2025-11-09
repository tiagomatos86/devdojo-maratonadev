package academy.devdojo.maratonajava.javacore.Pwrapper.test;

public class WrapperTest02 {
    public static void main(String[] args) {
        // Autoboxing: É o processo automático de converter um tipo primitivo em sua classe wrapper correspondente
        int num = 10;
        Integer obj = num; // autoboxing

        // Unboxing: É o processo inverso: converter uma classe wrapper de volta para seu tipo primitivo.
        Integer obj2 = 20;
        int num2 = obj; // unboxing

        //Alguns exemplos de métodos das classes wrapper

        // parse - Basicamente todas classes wrapper possuem parse, ex: transformar String em Integer com parse:
        int intN = Integer.parseInt("10");
        System.out.println(intN);

        // Utilizando a classe wrapper Character para retonar se é digito ou não:
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        // Verificando se alfabético
        System.out.println(Character.isAlphabetic('A'));
        System.out.println(Character.isAlphabetic('9'));
        // Verificando se é letra ou digito numérico
        System.out.println(Character.isLetterOrDigit('!')); //Falso pq é pontuação
        // Virificando se é maiúsculo ou minúsculo
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.isUpperCase('a'));
        // transformando maiúsculo e minúsculo
        System.out.println(Character.toLowerCase('A'));
        System.out.println(Character.toUpperCase('a'));
    }



}
