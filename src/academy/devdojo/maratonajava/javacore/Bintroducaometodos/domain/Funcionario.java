package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

import java.util.Arrays;

public class Funcionario {
    public Funcionario (String nome, int idade, double[] salarios){
        this.nome = nome;
        this.idade = idade;
        this.salarios = salarios;
    }
    private String nome;
    private int idade;
    private double[] salarios;

    //gets & setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }

    public void setSalario(double[] salarios) {
        this.salarios = salarios;
    }

    public void mostrarSalarios() {
        for (double salario : salarios) {
            System.out.println(salario);
        }
    }

    public double mediaSalarial() {
        double total = 0;
        for (int i = 0; i < salarios.length; i++) {
            total += salarios[i];
        }
        double media = total / salarios.length;
        return media;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "idade=" + idade +
                ", nome='" + nome + '\'' +
                ", salarios=" + Arrays.toString(salarios) +
                '}';
    }
}
