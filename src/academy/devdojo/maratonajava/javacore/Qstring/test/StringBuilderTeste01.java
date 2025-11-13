package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTeste01 {
    public static void main(String[] args) {
        String nome = "Tiago Matos";
        nome.concat(" DevDojo");
        System.out.println(nome);
        //frases e palavras do tipo StringBuilder não são imutáveis
        StringBuilder sb = new StringBuilder(); // se não passar nada cria uma StringBuilder com capacidade de 16 caracteres
        //Objetos do tipo StringBuilder e String não são a mesma coisa
        //sb = nome; //isso dá erro, pq sb é do tipo StringBuilder e nome do tipo String
        // não é possível fazer atribuição direta em StringBuilder, ex: sb = "Tiago" dá erro
        sb.append("Tiago Matos"); //para atribuir no StringBuilder é preciso usar o método append()
        // StringBuilder não possuem concat, pois o append funciona como um concat
        StringBuilder sb2 = new StringBuilder("Erik"); //possui um toString() interno que converte o que foi passado por parâmetro,
        sb2.append(" Gabriel Ribeiro Matos");
        System.out.println(sb2);
        System.out.println(sb.reverse()); //reverte a StringBuilder
        sb.reverse(); //retorna ao original
        StringBuilder sb3 = new StringBuilder("String Builder");
        sb3.delete(0, 3); //deleta os caracteres 0 até a posição 3
        System.out.println(sb3);
    }
}
