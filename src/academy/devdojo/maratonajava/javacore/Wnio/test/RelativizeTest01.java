package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;

public class RelativizeTest01 {
    public static void main(String[] args) {
        // Relativizar é descobrir quantos diretórios subir (..) ou descer para ir de um caminho a outro.
        // Ele responde à pergunta: “como eu saio do path A para chegar no path B?”
        Path dir = Path.of("/home/Tiago"); //Path.of é a versao mais moderna (a partir do java 11) Paths.get é a versão a ser usada no Java 8 e 7
        Path classe = Path.of("/home/Tiago/dev/HelloWorld.java");
        Path pathToClasse = dir.relativize(classe);
        System.out.println(pathToClasse);

        Path dir2 = Path.of("/home/Tiago/dev/project/newFolder");
        Path file = Path.of("/home/Tiago/teste.txt");
        Path toFile = dir2.relativize(file);
        System.out.println(toFile);

        Path absolut1 = Path.of("/home/Tiago");
        Path absolut2 = Path.of("/usr/local");
        Path absolut3 = Path.of("/home/Tiago/dev/HelloWorld.java");
        Path relative1 = Path.of("temp");
        Path relative2 = Path.of("temp/temp.2025781237");

        System.out.println("1: " + absolut1.relativize(absolut3));
        System.out.println("2: " + absolut3.relativize(absolut1));
        System.out.println("3: " + absolut1.relativize(absolut2));
        System.out.println("4: " + relative1.relativize(relative2));
//        System.out.println("5: " + absolut1.relativize(relative2)); //erro: para usar o relativize os paths precisam ser absoluto/absoluto ou relativo/relativo, não é possivel relativizar um caminho absoluto com um relativo ou vice-versa

    }

}
