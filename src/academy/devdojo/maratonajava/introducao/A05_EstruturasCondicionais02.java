package academy.devdojo.maratonajava.introducao;

public class A05_EstruturasCondicionais02 {
    public static void main(String[] args) {
        int idade = 21;
        boolean isInfantil = idade <= 15;
        boolean isJuvenil = idade > 15 && idade <= 17;
        boolean isJunior = idade > 17 && idade <= 20;

        if(isInfantil) {
            System.out.println("Infantil: "+ idade +" Sub-15");
        } else if(isJuvenil) {
            System.out.println("Juvenil: " + idade + " Sub-17");
        } else if(isJunior){
            System.out.println("Junior: " + idade + " Sub-20");
        } else {
            System.out.println("Idade: "+ idade + " fora das categorias de base");
        }
    }
}
