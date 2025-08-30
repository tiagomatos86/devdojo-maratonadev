package academy.devdojo.maratonajava.javacore.ZZtestesAleatorios.exceptionstestes;

public class ValidadorCopilot {
    // Método que pode lançar uma exceção → usamos 'throws'
    public static void validarNome(String nome) throws Exception {
        if (nome == null || nome.isEmpty()) {
            // Lançamos a exceção manualmente → usamos 'throw'
            throw new Exception("O nome não pode ser vazio.");
        }
        System.out.println("Nome válido: " + nome);
    }

    public static void main(String[] args) {
        try {
            // Tentamos validar um nome → pode lançar exceção
            validarNome(""); // Vai lançar exceção
        } catch (Exception e) {
            // Capturamos e tratamos a exceção aqui
            System.out.println("Erro ao validar nome: " + e.getMessage());
        }
    }
}

