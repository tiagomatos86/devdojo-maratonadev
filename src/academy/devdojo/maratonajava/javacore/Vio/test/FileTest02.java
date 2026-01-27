package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("pasta");
        boolean isDirectoryCreated = fileDiretorio.mkdir(); //cria o diretório
        System.out.println(isDirectoryCreated);
        //criando arquivo dentro do diretório usando caminho absoluto
//        File fileArquivoDiretorio = new File("D:\\Cursos\\DevDojo-MaratonaJava-ViradoNoJiraya\\maratona-java\\pasta\\arquivo.txt");
        File fileArquivoDiretorio = new File(fileDiretorio, "arquivo2.txt"); //passa o objeto referência do dirótio como caminho e o nome do arquivo a ser criado
        boolean isFileCreated = fileArquivoDiretorio.createNewFile();
        System.out.println(isFileCreated);
        File fileRenamed = new File(fileDiretorio, "arquivo_renomeado.txt");

        // renomeando arquivo
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println(isRenamed);

        // renomeando diretorio
        File directoryRenamed = new File("folder");
        boolean isDirectoryRenamed = fileDiretorio.renameTo(directoryRenamed);
        System.out.println(isDirectoryRenamed);

    }
}
