package academy.devdojo.maratonajava.javacore.Zgenerics.service;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Carro;

import java.util.List;

public class RentalService<T> {
    public List<T> objetosDisponiveis;
    public RentalService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }
    public T buscarObjetoDisponivel(){
        System.out.println("Buscando Veículo Disponível...");
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando veículo: " + t);
        System.out.println("Veículos disponíveis para alugar");
        System.out.println(objetosDisponiveis);
        return t;
    }

    public void retornarObjetoAlugado(T t){
        System.out.println("Devolvendo veículo" + t);
        objetosDisponiveis.add(t);
        System.out.println("Veículos disponíveis: \n" + objetosDisponiveis);
    }
}
