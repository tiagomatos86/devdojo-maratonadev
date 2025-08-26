package academy.devdojo.maratonajava.introducao;

public class A05_testePorcentagem {
    public static double porcentagem(double val, double pct) {
        //double res = (pct/100) * val;
        double res = (pct*val) / 100;
        return res;
    }
    public static void main(String[] args) {
        double valor = 34.712;
        double porcent = 9.70;
        System.out.println(porcentagem(valor, porcent));
    }
}

