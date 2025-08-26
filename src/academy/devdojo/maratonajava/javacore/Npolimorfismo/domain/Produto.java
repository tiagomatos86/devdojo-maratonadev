package academy.devdojo.maratonajava.javacore.Npolimorfismo.domain;

public abstract class Produto implements Taxavel {
    protected String nome;
    protected double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    /*
        ao implementar uma interface em uma classe abstrata
        os métodos da interface não precisam ser escritos (implementados) na classe abastrata
        ficando na obrigação das subclasses da classe abstrata implementaram os métodos da interface
        não é preciso usar o implemets nas subclasses da classe abatratas pq é implícito que já está implementado na superclasse abastrata
        ficando na obrigação das classes concretas apenas a implementaçaõ dos métodos.
     */

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
