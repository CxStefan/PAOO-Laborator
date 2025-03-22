import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(0);
        lista.add(7);
        lista.add(2);
        lista.add(9);

        System.out.println("Inainte de sortare" +lista);

        Collections.sort(lista);
        System.out.println("Dupa sortare" + lista);
    }
}
