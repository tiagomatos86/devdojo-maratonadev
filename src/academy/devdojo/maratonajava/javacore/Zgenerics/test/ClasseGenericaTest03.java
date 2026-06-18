package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.BarcoRentavelService;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Carro> listaCarros = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Mercedes")));
        List<Barco> listaBarcos = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Iate")));

        RentalService<Carro> rentalService = new RentalService<>(listaCarros);
        RentalService<Barco> rentalService2 = new RentalService<>(listaBarcos);

        Carro carro = rentalService.buscarObjetoDisponivel();
        System.out.println("Usando carro por um mês...");
        rentalService.retornarObjetoAlugado(carro);

        Barco barco = rentalService2.buscarObjetoDisponivel();
        System.out.println("Usando Barco por um mês...");
        rentalService2.retornarObjetoAlugado(barco);


    }
}
