package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.domain.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTeste01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner scn = new Scanner(System.in);
        String userNameDB = "Goku";
        String senhaDB = "Chichi&Gohan&Gotten";

        System.out.println("Usuário: ");
        String userNameTeclado = scn.nextLine();
        System.out.println("Senha: ");
        String senhaTeclado = scn.nextLine();

        scn.close();

        if(!userNameDB.equals(userNameTeclado) || !senhaDB.equals(senhaTeclado)) {
            throw new LoginInvalidoException("Usuário ou senha inválidos");
        }

        System.out.println("Usuário Logado Com Sucesso");

    }
}
