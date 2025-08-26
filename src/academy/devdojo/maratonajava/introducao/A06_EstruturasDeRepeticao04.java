package academy.devdojo.maratonajava.introducao;

public class A06_EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        double valorCarro = 85000;

        for(int parc = 1; parc <= valorCarro; parc++) {
            double valorParc = valorCarro / parc;
            if(valorParc < 1000) break;
            System.out.println("Parcela " + parc + " R$" + valorParc);
        }
    }
}
