package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.domain.Local;

public class OuterClassTest02 {
    private String name = "Shiryu";

    // Local classes : classes dentro de um método ou de um bloco de inicialização estático
    void print() {
        // atributos do método podem ser usados na classe local, mas eles devem ser final ou efetivamente final (nao declara o final mas não faz modificações, o java considera efetivamente final, se fizer modificações irá dar erro no método da classe local)
        String lastName = " de Dragão";

        // a Classe só pode ter os seguites tipos de modificadoresde acesso: abstract, final ou default
        class LocalClass {
            public void printLocal(){
                System.out.println(name + lastName);
            }
        }
        // para usar a classe local é preciso instancia-la dentro do método
//        LocalClass localClass = new LocalClass();
//        localClass.printLocal();

        // outra forma de instanciar: instancia é já chama o método
        new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        OuterClassTest02 outer = new OuterClassTest02();
        outer.print();
    }
}
