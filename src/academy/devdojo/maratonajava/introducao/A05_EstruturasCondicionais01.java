package academy.devdojo.maratonajava.introducao;

public class A05_EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 17;
        boolean isAutorizado = idade >= 21;
        if(isAutorizado) {
            System.out.println("Venda autorizada para bebidas alcoólicas.");
        } else {
            System.out.println("Não autorizado");
        }

        boolean isSolteiro = false;
        if(!isSolteiro) {
            System.out.println("Usuário casado");
        } else {
            System.out.println("Usuário solteiro");
        }
    }

    public static class A05_EstruturasCondicionais02 {
    }
}
