package academy.devdojo.maratonajava.javacore.Xserializacao.test;

import academy.devdojo.maratonajava.javacore.Xserializacao.domain.Aluno;
import academy.devdojo.maratonajava.javacore.Xserializacao.domain.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class SerializacaoTeste01 {
    public static void main(String[] args) {
        Aluno aluno =  new Aluno(1L, "Seiya", "Saori123");
        Turma turma = new Turma("Maratona Java - Virado no Jiraya");
        aluno.setTurma(turma);
        serializar(aluno);
        deserializar();
    }

    // serializa o objeto
    private static void serializar(Aluno aluno) {
        Path path = Path.of("home/ser/aluno.ser");
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deserializar() {
        Path path = Path.of("home/ser/aluno.ser");
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            Aluno aluno = ((Aluno) ois.readObject());
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
