package academy.devdojo.maratonajava.introducao;

import org.w3c.dom.ls.LSOutput;

public class A07_Arrays02 {
    // Valores de incialização padrão
    // Variáveis de tipo primitivo:
    // byte, short, int, long, float e double = 0
    // char = unicode -> '\u0000' (espaço em branco)
    // boolean = false;
    // Variável de referência: (obs: variáveis que representam arrays são variáveis de referência
    // String = null;
    public static void main(String[] args) {
        String[] nomes = new String[3];
        for(String nome : nomes) System.out.println(nome);
    }

}
