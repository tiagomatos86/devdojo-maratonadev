package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassTest01 {
    private String name = "Yusuke Urameshi";

    // Nested Classes: classes aninhadas
    class InnerClass {
        public void printOuterClassAttribute() {
            System.out.println(name);
            System.out.println(this); // referencia a classe interna
            System.out.println(OuterClassTest01.this); // referencia a classe externa
        }
    }


    public static void main(String[] args) {
        // para criar um objeto de uma classe interna é preciso antes instanciar um objeto da classe externa
        OuterClassTest01 outerClass = new OuterClassTest01();
        InnerClass innerClass = outerClass.new InnerClass();
        innerClass.printOuterClassAttribute();

        // outra forma de instanciar uma classe interna
        InnerClass innerClass2 = new OuterClassTest01().new InnerClass();
        innerClass2.printOuterClassAttribute();
    }
}
