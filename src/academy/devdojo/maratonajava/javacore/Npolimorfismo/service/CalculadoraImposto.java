package academy.devdojo.maratonajava.javacore.Npolimorfismo.service;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador) {
        System.out.println(" ");
        System.out.println("##### Relatório de imposto do computador #####");
        double imposto = computador.calcularImposto();
        System.out.println("Computador: " + computador.getNome());
        System.out.println("Valor do computador: " + computador.getValor());
        System.out.println("Alíquota: " + Computador.IMPOSTO_COMPUTADOR);
        System.out.println("Valor do imposto sobre computador: " + imposto);
        System.out.println("Valor do computador com imposto: " + (computador.getValor() + imposto) + '\n');
    }

    public static void calcularImpostoTomate(Tomate tomate) {
        System.out.println(" ");
        System.out.println("##### Relatório de imposto do tomate #####");
        double imposto = tomate.calcularImposto();
        System.out.println("Tomate: " + tomate.getNome());
        System.out.println("Valor do tomate: " + tomate.getValor());
        System.out.println("Alíquota: " + Tomate.IMPOSTO_TOMATE);
        System.out.println("Valor do imposto sobre tomate: " + imposto);
        System.out.println("Valor do tomate com imposto: " + (tomate.getValor() + imposto));
    }

    // calculadora genérica
    public static void calcularImposto(Produto produto) {
        System.out.println(" ");
        System.out.println("##### Relatório de imposto do produto #####");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Valor do imposto: " + imposto);
        System.out.println("Valor do produto com imposto: "+ (produto.getValor() + imposto));
        if(produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println("Data de Validade: " +  tomate.getDataValidade());
        }

    }
}
