import javax.print.attribute.standard.MediaSize;

public class FacadeClass {

    private Systems systems;
    private Engines engines;
    private Allign allign;
    private PreFlightChecks preFlightChecks;

    public FacadeClass(){
        systems = new Systems();
        engines = new Engines();
        allign = new Allign();
        preFlightChecks = new PreFlightChecks();
    }

    public void takeOff(){
        systems.start();
        engines.start();
        allign.start();
        preFlightChecks.start();

        System.out.println("Ready to take off!");
    }
}
