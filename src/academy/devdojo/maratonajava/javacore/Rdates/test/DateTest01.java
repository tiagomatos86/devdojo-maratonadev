package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date); // retorna a data atual
        Date date1 = new Date(1_000_000_000_000l); //passa um long representando os milissegundos, será estanciado uma data que será que corresponderá ao tempo passado da epoch 1-1-1970 + os milessegundos passados
        System.out.println(date1); //epoch + 1_000_000_000 = Mon Jan 12 10:46:40 BRT 1970
        //para retornar a data, implicitamente o date chama o toString da classe e converte os milessegundos em uma String no formato de uma data
        System.out.println(date.getTime()); //long que representa em milessegundos o dia de hj
        System.out.println(date1.getTime());
    }
}
