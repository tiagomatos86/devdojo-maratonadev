package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest05 {
    public static void main(String[] args) {
        try {
            talvezLanceException();
        // o multi catch permite reduzir a quantidade de catchs colocando todas as possíveis exceções na mesma declaração separadas por pipeline |
        // OBS: Não é possível colocar exceções da mesma árvore de herança na declaração, apenas diferentes sendo necessário criar um novo catch
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException, IOException {

    }

}
