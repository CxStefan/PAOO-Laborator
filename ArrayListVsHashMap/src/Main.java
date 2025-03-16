import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(9,2,5,1,3));
        HashMap<String,Integer> map = new HashMap<>();

        map.put("Popovici",5);
        map.put("Andrei",1);
        map.put("Mihai",6);

        System.out.println(map);
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
    }
}

