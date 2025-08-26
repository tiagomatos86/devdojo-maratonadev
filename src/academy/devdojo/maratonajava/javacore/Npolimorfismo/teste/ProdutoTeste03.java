package academy.devdojo.maratonajava.javacore.Npolimorfismo.teste;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTeste03 {
    public static void main(String[] args) {
        Produto computador01 = new Computador("Acer Nitro 5", 4200.00);
        Tomate tomate01 = new Tomate("Italiano Orgânico", 4.80);

        tomate01.setDataValidade("15/09/2025");
        CalculadoraImposto.calcularImposto(tomate01);
        CalculadoraImposto.calcularImposto(computador01);
    }
}
