package academy.devdojo.maratonajava.javacore.Npolimorfismo.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Calculadora;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutosTeste01 {
    public static void main(String[] args) {
        Computador computador01 = new Computador("Acer Nitro 5", 4200.00);
        Tomate tomate01 = new Tomate("Italiano Orgânico", 4.80);

        Computador computador02 = new Computador("NUC10i7", 11000);
        Tomate tomate02 = new Tomate("Holandês", 10.00);

        Computador computador03 = new Computador("Macbook pro M4 max", 39599.10);

        Televisao tv01 = new Televisao("Samsung 4k 50\" - 2025", 2350.00);

        CalculadoraImposto.calcularImpostoComputador(computador01);
        CalculadoraImposto.calcularImpostoTomate(tomate01);
        CalculadoraImposto.calcularImposto(tomate01);
        CalculadoraImposto.calcularImpostoComputador(computador02);
        CalculadoraImposto.calcularImpostoTomate(tomate02);
        CalculadoraImposto.calcularImposto(computador03);
        CalculadoraImposto.calcularImpostoComputador(computador03);
        CalculadoraImposto.calcularImposto(tv01);


    }
}
