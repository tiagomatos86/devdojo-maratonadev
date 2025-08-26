package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Lutador;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.VerificaLutador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeituraDoTeclado {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        List<Lutador> lutadores = new ArrayList<>();
        System.out.println("----- Cadastro de Lutadores -----");

        while (true) {
            System.out.println("----- Entre Com Seus Dados -----");

            System.out.println("Qual Seu Nome?");
            String nome = scn.nextLine();

            System.out.println("Quando você nasceu? (Insira data no formato DD/MM/AAAA");
            String dataNascString = scn.nextLine();

            System.out.println("Qual seu peso?(Sepere as gramas por vírgula \",\" ");
            double peso = scn.nextDouble();

            System.out.println("Qual o seu sexo?(M/F)");
            char sexo = scn.next().charAt(0);
            scn.nextLine(); // consumir quebra de linha

            Lutador lutador = new Lutador(nome, dataNascString, peso, sexo);
            lutadores.add(lutador);

            System.out.print("Deseja cadastrar outro lutador? (S/N): ");
            String continuar = scn.nextLine();
            if (continuar.equalsIgnoreCase("N")) {
                break;
            }
            System.out.println();
        }

        System.out.println("\n----- Lutadores Cadastrados -----");
        for (Lutador lutador : lutadores){
            System.out.println(VerificaLutador.verificaLutador(lutador));;
        }
    }
}
