package academy.devdojo.maratonajava.javacore.Ycolecoes.domain;

import java.util.Objects;

public class Manga implements Comparable<Manga>{

    private Long id;
    private String nome;
    private double preco;
    private int quantidade;

    public Manga(Long id, String nome, double preco) {
        Objects.requireNonNull(id, "ID não pode ser nulo");
        Objects.requireNonNull(nome, "Nome não pode ser nulo");

        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Manga(Long id, String nome, double preco, int quantidade) {
        this(id, nome, preco);
        this.quantidade = quantidade;
    }


    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() { return preco; }

    public double getQuantidade() { return quantidade; }

    public void setId(Long id) { this.id = id; }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco + '\'' +
                ", quantidade=" + quantidade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Double.compare(preco, manga.preco) == 0 && Objects.equals(id, manga.id) && Objects.equals(nome, manga.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
    }

//    @Override
//    public int compareTo(Manga outroManga) {
//        // esse método precisa retornar um inteiro
//        // retorna negativo se o this < outroManga
//        // se this == outroManga, return 0
//        // retorna positivo se this for > outroManga
//        if(this.id < outroManga.getId()) return -1;
//        else if(this.id.equals(outroManga.getId())) return 0;
//        else return 1;
//    }
//    @Override
//    public int compareTo(Manga outroManga) {
//        // Quando o objeto usar um atributo tipado com uma classe Wrapper (exemplo o id é Long) é possível usar o compareTo da própria classe wrapper
//        // não funciona ao usar tipos primitivos, apenas wrappers
//        return this.id.compareTo(outroManga.getId());
//    }

//    @Override
//    public int compareTo(Manga outroManga) {
//        // se usar um tipo primitivo como atributo de comparação, realizar casting
//        return Double.compare(this.preco, outroManga.getPreco());
//    }

    @Override
    public int compareTo(Manga outroManga) {
        // por ordem alfabética:
        return this.nome.compareTo(outroManga.getNome());
    }


}


