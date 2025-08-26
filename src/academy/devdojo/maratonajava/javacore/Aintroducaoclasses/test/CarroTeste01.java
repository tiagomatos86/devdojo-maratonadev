package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro nissan = new Carro("Nissan", "GT-R R35", 2007);
        Carro honda =  new Carro("Honda", "N-Box", 2025);
        System.out.println(nissan.toString());
        System.out.println(honda.toString());

        Carro carro1 = nissan;

        System.out.println(carro1.toString());
    }
}

