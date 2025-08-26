package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public interface DataLoader {
    // em interfaces, por padrão os métodos são públicos e abstratos
    // Desde o JAVA 8, interfaces podem conter métodos concretos através do default ou static:
    // default methods: Permitem fornecer uma implementação padrão que pode ser usada ou sobrescrita pelas classes que implementam a interface.
    // 2. static methods: São métodos estáticos que pertencem à interface e não podem ser sobrescritos.
    // Interfaces podem ter atributos, porém apenas static final (constantes)

    // como atributos em java são obrigatoriamente public statica final, para evitar redundância de escrita de código, ao invés de escrevê-los assim:
    //public static final int MAX_DATA_SIZE = 10;
    //pode-se escrêve-los assim:
    int MAX_DATA_SIZE = 10;

    void load(); // é o mesmo que: public abstract void load();

    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }

    // não pode ser sobreescrito e é chamado direto pela referência de classe DataLoader.retrieveMaxDataSize();
    // como todos métodos são públicos numa interface, pode retirar o public dos métodos estáticos
    //public static void retrieveMaxDataSize() {
    static void retrieveMaxDataSize() {
        System.out.println("retrieveMaxDataSize: Dentro da Interface");
    }
}
