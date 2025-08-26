package academy.devdojo.maratonajava.javacore.Gassociacao.domain;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class VerificaLutador {

    public static int calculaIdade(String dataNascString) {
        // Converte a String em uma LocalDate
        DateTimeFormatter formatoEntrada = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // cria o formato de data para a String que será formatada
        LocalDate dataNasc = LocalDate.parse(dataNascString, formatoEntrada); //formata a String em tipo LocalDate no formato dd/MM/yyyy

        // Pega a data atual
        LocalDate dataAtual = LocalDate.now();

        // Calcula a idade
        Period periodoEntreDatas = Period.between(dataNasc, dataAtual);
        int idade = periodoEntreDatas.getYears(); //passa o periodo decorrido em anos (idade)

        return idade;
    }

    public static String verificaCategoria(char sexo, double peso) {
        String categoria = "";
        if(sexo == 'F' ) {
            if(peso <= 50) {
                categoria = " lutará na categoria: Peso Palha";
            } else if (peso > 50 && peso <= 55) {
                categoria = " lutará na categoria: Peso Mosca";
            } else if (peso > 55 && peso <= 65) {
                categoria = " lutará na categoria: Peso Galo";
            } else if (peso > 65 && peso <= 70) {
                categoria = " lutará na categoria: Peso Pena";
            } else {
                categoria = " está fora do peso e não pode lutar";
            }
        } else if(sexo == 'M' ) {
            if(peso > 60 && peso <= 70) {
                categoria = " lutará na categoria: Peso Leve";
            } else if (peso > 70 && peso <= 80) {
                categoria = " lutará na categoria: Peso Médio";
            } else if (peso > 80 && peso <= 90) {
                categoria = " lutará na categoria: Peso Meio-Pesado";
            } else if(peso > 90 && peso <= 100) {
                categoria = " lutará na categoria: Peso Cruzador";
            } else if(peso > 100) {
                categoria = " lutará na categoria: Peso Pesado";
            } else {
                categoria = " está fora do peso e não pode lutar";
            }
        }
        return categoria;
    }

    public static String verificaLutador(Lutador lutador) {
        int idade = calculaIdade(lutador.getDataNascString());
        String sexoString = (lutador.getSexo() == 'M' ? "masculino" : "feminino");
        String categoria = verificaCategoria(lutador.getSexo(), lutador.getPeso());
        String msgAoLutador = "";
        if(idade < 18 ) {
            msgAoLutador = lutador.getNome() + " você possui apenas " + idade + " anos e não pode lutar";
        } else {
            msgAoLutador = lutador.getNome() + " de " + idade + " anos, é do sexo " + sexoString + " e pesando " + lutador.getPeso() + " kgs " + categoria;
        }
        return msgAoLutador;
    }

}
