package academy.devdojo.maratonajava.javacore.Kenum.domain;

// Para criar enumerações com valores, é preciso declarar um construtor que passará os valores para as enums.
// Tbm é preciso criar variáveis que armazenem esses valores que serão passados para as enums via construtor
public enum TipoCliente02 {
    // ENUMs com valores:
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    // Variável que guarda o valor passado. As variáveis não podem vir antes das enumerações
    public final int VALOR;
    private String nomeRelatorio;

    // Construtor da ENUM
    TipoCliente02(int valor, String nomeRelatorio) {
        this.VALOR = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public static TipoCliente02 tipoCliente02PorNomeRelatorio(String nomeRelatorio) {
        // O values() retorna um array do tipo TipoClientes02 com todas as enums
        for (TipoCliente02 tipoCliente02 : values()) {
            if(tipoCliente02.getNomeRelatorio().equals(nomeRelatorio)) {
                return tipoCliente02;
            }
        }
        return null;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
