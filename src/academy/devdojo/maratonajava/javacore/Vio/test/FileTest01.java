package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest01 {
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir")); // mostra o local do working directory
        File file = new File("file.txt"); //O arquivo será criado em: diretório de trabalho (working directory) da aplicação Java
        //File file = new File("D:\\Cursos\\DevDojo-MaratonaJava-ViradoNoJiraya\\maratona-java\\arquivo\\file.txt"); // é preciso passar o caminho absoluto caso queira salvar em outro diretório que não o working directory
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Arquivo criado? " + isCreated);
            boolean exists = file.exists();
            System.out.println("Relative path: " + file.getPath());
            System.out.println("Canonical path: " + file.getCanonicalPath());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("is directory? " + file.isDirectory());
            System.out.println("is file? " + file.isFile());
            System.out.println("is Hidden? " + file.isHidden());
            System.out.println("Last modified: " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault())); //retorna um long (epoch)
            if (exists) {
                System.out.println("Deleted file? " + file.delete());
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
