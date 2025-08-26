package academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.test;

import academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.domain.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {

        Carro car1 = new Carro("BMW", 280);
        Carro car2 = new Carro("Mercedes", 275);
        Carro car3 = new Carro("Audi", 290);

        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());

        Carro.setVelocidadeLimite(270);

        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());

        System.out.println("Velocidade limite de todos os carros: " + Carro.getVelocidadeLimite());
    }
}
