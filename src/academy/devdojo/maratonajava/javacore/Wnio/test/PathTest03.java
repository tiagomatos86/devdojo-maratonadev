package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest03 {
    public static void main(String[] args) {
        Path dir = Paths.get("home/Tiago");
        Path file = Paths.get("dev/file.txt");

        // resolvendo o Path (ambos relativos)
        Path resolvedPath = dir.resolve(file);
        System.out.println(resolvedPath);

        // trabalhando com paths absolutos
        Path absolute = Paths.get("/home/Tiago");
        Path relative = Paths.get("dev");
        Path pathFile = Paths.get("file.txt");
//        Path resolved2 = absolute.resolve(relative);
//        System.out.println(resolved2);
        System.out.println("1: " + absolute.resolve(relative));
        System.out.println("2: " + absolute.resolve(pathFile));
        System.out.println("3: " + relative.resolve(absolute)); // não vai resolver nada pq o caminho já é absoluto
        System.out.println("4: " + relative.resolve(pathFile));
    }

}
