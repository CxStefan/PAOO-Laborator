public class C2NrAdapterToC3Nr {

    public static C3Nr adapt(C2Nr c2nr) {
        return new C3Nr(c2nr.getNr1(),c2nr.getNr2(),0);
    }
}
