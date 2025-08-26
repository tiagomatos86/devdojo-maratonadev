package academy.devdojo.maratonajava.javacore.Kenum.domain;

public class Cliente02 {
    // É possível criar um ENUM dentro de uma classe comum
    public enum TipoPagamento {
        CREDITO,
        DEBITO;
    }
    private String nome;
    private TipoCliente02 tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente02(String nome, TipoCliente02 tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente02 getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente02 tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente02{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoClienteInt=" + tipoCliente.VALOR +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
