import java.util.ArrayList;



public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> vector1 = new ArrayList<Integer>();

        vector1.add(2);
        vector1.add(3);
        vector1.add(4);

        int[] suma = {0};

        vector1.forEach(x -> {
            suma[0] += x;
        });
        System.out.println(suma[0]);
    }
}

















