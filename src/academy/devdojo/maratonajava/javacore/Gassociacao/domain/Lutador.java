package academy.devdojo.maratonajava.javacore.Gassociacao.domain;

public class Lutador {
   private String nome;
   private String dataNascString;
   private double peso;
   private char sexo;

    public Lutador(String nome, String dataNascString, double peso, char sexo) {
        this.nome = nome;
        this.dataNascString = dataNascString;
        this.peso = peso;
        this.sexo = sexo;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascString() {
        return dataNascString;
    }

    public void setDataNascString(String dataNascString) {
        this.dataNascString = dataNascString;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
