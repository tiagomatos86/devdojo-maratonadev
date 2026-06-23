package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Barco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//class BarcoNameComparator implements Comparator<Barco> {
//    @Override
//    public int compare(Barco o1, Barco o2) {
//        return o1.getNome().compareTo(o2.getNome());
//    }
//}

public class AnonymousClassesTest02 {
    public static void main(String[] args) {
        List<Barco> barcoList = new ArrayList<>(List.of(new Barco("Caiaque"), new Barco("Voadeira")));
        barcoList.add(new Barco("Lancha"));
        barcoList.add(new Barco("Canoa"));
        barcoList.add(new Barco("Iate"));
        System.out.println(barcoList);

//        uso de classe anonima para instanciar uma iterface
//        ao invés de criar uma classe de comparação, instancia anonimamente o comparator
//        barcoList.sort(new BarcoNameComparator());
        barcoList.sort(new Comparator<Barco>() {
            @Override
            public int compare(Barco o1, Barco o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });

        System.out.println(barcoList);
    }
}
