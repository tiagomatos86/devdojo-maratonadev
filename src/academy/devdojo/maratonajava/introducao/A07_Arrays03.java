package academy.devdojo.maratonajava.introducao;

public class A07_Arrays03 {
    public static void main(String[] args) {
        String[] nomes = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "Yusuke";
        nomes[2] = "Kenshin";
        nomes[3] = "Mikasa";
        for(String nome : nomes) System.out.println(nome);
        for(int i = 0; i < nomes.length; i ++) System.out.println("Oi, meu nome é  " + nomes[i]);
    }
}
