package academy.devdojo.maratonajava.javacore.Hherenca.domain;

public class Funcionario extends Pessoa{
    private double salario;

    public Funcionario(){
        super();
    }

    public Funcionario(String nome, String cpf, Endereco endereco, double salario) {
        super(nome, cpf, endereco);
        this.salario = salario;
    }

    public void relatorioPagamento() {
        System.out.println("Eu " + this.nome + " recebi o pagamento."); // é possível acessar o atributo nome com o this pois foi definido como protected na super classe
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + "Salario= " + this.salario ;
    }
}
