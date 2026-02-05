package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttributesTest {
    public static void main(String[] args) throws IOException {
        Path path  = Paths.get("folder/teste_dos.txt");
        if(Files.notExists(path)) Files.createFile(path);
        Files.setAttribute(path, "dos:hidden", true); //torna o arquivo oculto em sistemas Dos (Windows)
        Files.setAttribute(path, "dos:readonly", true); //torna o arquivo somente de leitura em sistemas Dos (Windows)

        Files.setAttribute(path, "dos:hidden", false); //retira o oculto em sistemas Dos (Windows)
        Files.setAttribute(path, "dos:readonly", false); //retira o somente de leitura em sistemas Dos (Windows)

        //Manipulando atributos com o view
        DosFileAttributes dosFileAttributes = Files.readAttributes(path, DosFileAttributes.class);
        System.out.println(dosFileAttributes.isHidden()); //verifica se é oculto
        System.out.println(dosFileAttributes.isReadOnly()); //verifica se é somente de leitura

        DosFileAttributeView fileAttributeView = Files.getFileAttributeView(path, DosFileAttributeView.class);
        fileAttributeView.setHidden(true); //seta arquivo para oculto
        fileAttributeView.setReadOnly(true); //seta arquivo para somente de leitura

        System.out.println(fileAttributeView.readAttributes().isHidden());
        System.out.println(fileAttributeView.readAttributes().isReadOnly());
    }
}
