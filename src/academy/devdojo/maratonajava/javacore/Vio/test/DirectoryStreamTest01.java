package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class DirectoryStreamTest01 {
    public static void main(String[] args) {
        Path dir = Path.of("."); //pega o diretório atual que é o maratona-java
        try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
            for(Path path : stream) {
                System.out.println(path.getFileName());
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
