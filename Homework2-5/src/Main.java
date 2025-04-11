public class Main {

    public static void main(String[] args) {
        C2Nr c2nr = new C2Nr(2.5,3.8);
        System.out.println(c2nr);


        C3Nr c1 = new C3Nr(2.0,3.2,7.8);
        System.out.println(c1);


        C3Nr c3nr = C2NrAdapterToC3Nr.adapt(c2nr);
        System.out.println(c3nr);


    }
}
