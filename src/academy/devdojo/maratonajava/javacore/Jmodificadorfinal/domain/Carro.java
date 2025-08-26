package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domain;

public class Carro {
    private String nome;
    // um atributo final em java para ser considderado uma constante precisa ser public static e final.
    public static final double VELOCIDADE_LIMITE = 250; //convcenção para escrever constantes em java, tudo em uppercase e palavras separadas por underscore.
    public final Comprador COMPRADOR = new Comprador();

    public Carro(String nome) {
        this.nome = nome;

    }

    public final boolean carroLegalizado(){
        return true;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                "Velocidade Limite='" + Carro.VELOCIDADE_LIMITE + '\'' +
                "Proprietário='" + COMPRADOR.getNome() + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
