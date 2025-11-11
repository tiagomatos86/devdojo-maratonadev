package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        //String em java são imutáveis: uma vez criada o objeto string ficará de forma imutável no String Constant Pool
        String nome = "Tiago"; //Literal "Tiago" ficará no String constant pool
        String nome2 = "Tiago"; // O literal "Tiago" de nome2 é o mesmo objeto de nome.
        System.out.println(nome == nome2); //compara se as referências apontam para o mesmo objeto, se quiser comparar os conteúdos usar o equals()
        nome = "Tiago Matos"; // Como strings são imutáveis é impossível aterar seu valor, ao colocar "Tiago Matos" na variável nome, eu não estou alterando a String, mas criando um novo objeto literal "Tiago Matos" que ficará no String Pool e será referenciado agora por nome, que antes referenciava "Tiago", que continua existindo no String Constant Pool

        //Criando um novo objeto String no pool de strings
        String nome3 = new String("Tiago"); // o objeto string criado com new, é criado fora do String Pool
        System.out.println(nome2 == nome3); //vai retornar falso, pq apesar de terem o mesmo valor, são objetos diferentes, no caso existem 2 objetos literais "Tiago" um no pool e o criado com new fora do pool é um objeto diferente.
        //Com o método intern: a JVM verifica se já existe uma String igual no pool, Se existir, ela retorna a referência do objeto do pool. Se não existir, ela adiciona essa String ao pool e retorna a referência.
        System.out.println(nome2 == nome3.intern());

    }

}
