package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domain;

public class Ferrari extends Carro{

    public Ferrari(String nome) {
        super(nome);
    }

//    método não pode ser sobrescrito pois está definido como final na superclasse
//    public boolean carroLegalizado(){
//        return false;
//    }


    @Override
    public String toString() {
        return "Ferrari{" +
                "nome='" + super.getNome() + '\'' +
                "Proprietário='" + COMPRADOR.getNome() + '\'' +
                '}';
    }
}
