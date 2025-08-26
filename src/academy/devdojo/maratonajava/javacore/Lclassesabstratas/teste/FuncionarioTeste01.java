package academy.devdojo.maratonajava.javacore.Lclassesabstratas.teste;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
//        Funcionario func01 = new Funcionario("Zoro", 2000);
//        System.out.println(func01);

        Gerente gerente01 = new Gerente("Nami", 5000);
        System.out.println(gerente01);

        Desenvolvedor dev01 = new Desenvolvedor("Touya", 12000);
        System.out.println(dev01);

    }
}
