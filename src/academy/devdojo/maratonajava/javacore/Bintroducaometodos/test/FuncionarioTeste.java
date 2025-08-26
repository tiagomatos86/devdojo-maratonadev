package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Funcionario;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Tiago Matos", 39, new double[]{1600, 1518, 3118});

        System.out.println(func1.getNome());
        System.out.println(func1.getIdade());
        func1.mostrarSalarios();
        System.out.println(func1.toString());

        System.out.println(func1.mediaSalarial());

    }

}
