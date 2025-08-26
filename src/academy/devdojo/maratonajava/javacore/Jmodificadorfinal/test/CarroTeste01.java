package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.test;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domain.Carro;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domain.Ferrari;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Audi R8");

        carro1.COMPRADOR.setNome("Tiago Matos");
        System.out.println(carro1);
        System.out.println(carro1.COMPRADOR);

        Ferrari ferrari01 = new Ferrari("LaFerrari");
        ferrari01.COMPRADOR.setNome("Tiago Matos");

        System.out.println(ferrari01);
        System.out.println(ferrari01.carroLegalizado());
    }
}
