package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

// o Pacote NIO (New I/O) é uma forma mais moderna de trabalhar com arquivos e Inputs e Outputs que substitui o pacote IO
public class PathTest01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("D:\\Cursos\\DevDojo-MaratonaJava-ViradoNoJiraya\\maratona-java\\file.txt");
        Path p2 = Paths.get("D:\\Cursos\\DevDojo-MaratonaJava-ViradoNoJiraya\\maratona-java","file.txt");
        Path p3 = Paths.get("D:", "Cursos\\DevDojo-MaratonaJava-ViradoNoJiraya\\maratona-java", "file.txt");
        Path p4 = Paths.get("D:", "Cursos", "DevDojo-MaratonaJava-ViradoNoJiraya", "maratona-java", "file.txt");

        System.out.println(p1.getFileName());
        System.out.println(p2.getFileName());
        System.out.println(p3.getFileName());
        System.out.println(p4.getFileName());
    }
}
