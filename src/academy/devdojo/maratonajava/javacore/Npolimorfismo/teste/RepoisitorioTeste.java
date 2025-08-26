package academy.devdojo.maratonajava.javacore.Npolimorfismo.teste;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repository.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.RepositorioBancoDeDados;

public class RepoisitorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
    }
}
