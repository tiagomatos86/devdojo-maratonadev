package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.*;

public class TryWithResources01 {
    public static void main(String[] args) {

    }

    public static void lerArquivoTryWithResources()  throws IOException {
        try(Reader reader = new BufferedReader(new FileReader("teste.txt"))) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void lerArquivoFeio(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
               if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
