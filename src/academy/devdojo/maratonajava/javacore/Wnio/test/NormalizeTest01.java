package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String projectDirectory = "home/Tiago/dev";
        String txtFile = "../../file.txt";
        Path path1 = Paths.get(projectDirectory, txtFile);
        System.out.println(path1);
        System.out.println(path1.normalize()); // remove partes redundantes do caminho (., ..) e gera um path mais limpo
        Path path2 = Paths.get("/home/./Tiago/./dev");
        System.out.println(path2);
        System.out.println(path2.normalize());
    }
}
