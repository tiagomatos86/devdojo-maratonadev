package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringPerformanceTeste {
    public static void main(String[] args) {
        // verificando quanto tempo leva pro for concat rodar todas iterações
        long inicio = System.currentTimeMillis(); // pega o tempo atual em milissegundos no incio da rodagem d for
        concatString(50_000); // Strings demoram a serem processadas, ao testar 1 milhão, passados 2 minutos dei stop
        long fim = System.currentTimeMillis(); // pega o tempo atual em milessegundos após sair do for
        System.out.println("Tempo gasto para String: " + (fim - inicio) + "ms"); // fim - inicio dá o tempo total que demorou para o for rodar todas iterações.

        inicio = System.currentTimeMillis();
        concatStringBuilder(50_000); // String Builder é bem mais rápido para concatenar as Strings
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuilder: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(50_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuffer: " + (fim - inicio) + "ms");
    }

    private static void concatString(int tamanho) {
        String texto = "";
        for(int i =0; i < tamanho; i++) {
            texto += i;
        }
    }

    // para melhorar a performance do uso de strings, existem algums métodos, abaixo um deles, o StringBuilder
    // o string builder é recomendado para uso em sing-thread pois não é sincronizado
    private static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for(int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    // o string buffer faz o mesmo trabalho do builder, porém é sincronizado e é recomedado para um uso em multi-thread
    private static void concatStringBuffer(int tamanho) {
        StringBuffer sb = new StringBuffer(tamanho);
        for(int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
}
