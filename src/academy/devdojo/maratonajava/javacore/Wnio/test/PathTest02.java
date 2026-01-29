package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        //criando diretório
        Path folderPath = Paths.get("folder2");
        // verifica se já existe uma pasta quando se trabalha com um único diretório
        if (Files.notExists(folderPath)) {
            Path folderDirectory = Files.createDirectory(folderPath);
        }

        // casos onde se trabalhar com múltiplos diretórios onde o createDirectory não irá funcionar onde caso o diretório pai não exista é lançada uma exceção
        Path subFolderPath = Paths.get("folder2/subfolder/subsubfolder");
        Path subFolderDirectory = Files.createDirectories(subFolderPath);

        // criando arquivos
        Path filePath = Paths.get(subFolderPath.toString(), "file.txt");
        if(Files.notExists(filePath)) {
            Path filePathCreated = Files.createFile(filePath);
        }

        // copiar
        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "file_renamed.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING); //sobreescreve se já existir.
    }
}
