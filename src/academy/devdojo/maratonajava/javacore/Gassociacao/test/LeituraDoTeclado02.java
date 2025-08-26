package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Lutador;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.VerificaLutador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeituraDoTeclado02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        List<Lutador> lutadores = new ArrayList<>();

        System.out.println("----- Cadastro de Lutadores -----");

        while (true) {
            System.out.print("Nome: ");
            String nome = scn.nextLine();

            System.out.print("Data de nascimento (DD/MM/AAAA): ");
            String dataNasc = scn.nextLine();

            System.out.print("Peso (use vírgula para decimais): ");
            String pesoStr = scn.nextLine().replace(",", ".");
            double peso = Double.parseDouble(pesoStr);

            System.out.print("Sexo (M/F): ");
            char sexo = scn.next().charAt(0);
            scn.nextLine(); // consumir quebra de linha

            Lutador lutador = new Lutador(nome, dataNasc, peso, sexo);
            lutadores.add(lutador);

            System.out.print("Deseja cadastrar outro lutador? (S/N): ");
            String continuar = scn.nextLine();
            if (!continuar.equalsIgnoreCase("S")) {
                break;
            }
            System.out.println();
        }

        System.out.println("\n----- Lutadores Cadastrados -----");
        for (Lutador l : lutadores) {
            System.out.println(VerificaLutador.verificaLutador(l));
        }
    }
}
