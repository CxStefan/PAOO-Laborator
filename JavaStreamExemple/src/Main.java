import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,6,1,4,3));

        List<Integer> stream1 = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(stream1);     //filter cu functie lambda ptr a afisa doar nr pare

        List<Integer> stream2 = list.stream().sorted().collect(Collectors.toList());
        System.out.println(stream2); // sortarea listei folosind stream

    }
}
