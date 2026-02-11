package academy.devdojo.maratonajava.javacore.Vio.test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;

public class PathMatcherTest01 {
    public static void main(String[] args) {
        Path path1 = Path.of("pasta/subpasta/file.bkp");
        Path path2 = Path.of("pasta/subpasta/file.txt");
        Path path3 = Path.of("pasta/subpasta/file.java");
        matches(path1, "glob:*.bkp");
        matches(path1, "glob:**/*.bkp"); //ignora todo diretório para trás.
        // procura o que tem ou bkp, txt ou java.
        matches(path1, "glob:**/*.{bkp,txt,java}");
        matches(path2, "glob:**/*.{bkp,txt,java}");
        matches(path1, "glob:**/*.{bkp,txt,java}");

        matches(path1, "glob:**/*.???"); // procura um arquivo come exatamente 3 letras na extesão
        matches(path2, "glob:**/*.???");
        matches(path3, "glob:**/*.???");

        matches(path1, "glob:**/file.????"); // procura arquivo chamando file com 4 letras na extensão
        matches(path2, "glob:**/file.????");
        matches(path3, "glob:**/file.????");

        matches(path1, "glob:**/file.*"); // procura arquivo chamando file com qualquer extensão
        matches(path2, "glob:**/file.*");
        matches(path3, "glob:**/file.*");
    }

    private static void matches(Path path, String glob) {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " + matcher.matches(path));
    }
}
