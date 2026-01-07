package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw =new FileWriter(file, true)) { //O apende true garante que modifações no arquivo não apaguem o que foi escrito anteriormente, sem o true cada nova inserção apagará a anterior
            fw.write("Aula: 139\n");
            fw.flush(); // força a gravação imediata dos dados que ainda estão no buffer para o arquivo.
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
