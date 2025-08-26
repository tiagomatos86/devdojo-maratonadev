package academy.devdojo.maratonajava.javacore.Kenum.domain;

public class Cliente03 {
    private String nome;
    private TipoCliente02 tipoCliente;
    private TipoPagamento02 tipoPagamento;

    public Cliente03(String nome, TipoCliente02 tipoCliente, TipoPagamento02 tipoPagamento) {
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

    public TipoPagamento02 getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento02 tipoPagamento) {
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
