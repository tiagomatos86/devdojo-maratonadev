package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        // forma antiga de como alterar atributos de um arquivo
        LocalDateTime date = LocalDateTime.now().minusDays(10);
        File file = new File("folder2/novo.txt");
        boolean isCreated = file.createNewFile();
        System.out.println(file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli()));

        // forma mais recente usando o pacote NIO
        Path path = Path.of("folder2/new_path.txt");
        Files.createFile(path);
        FileTime fileTime = FileTime.from(date.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(path, fileTime);
        System.out.println(Files.isWritable(path));
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isExecutable(path));
    }
}
