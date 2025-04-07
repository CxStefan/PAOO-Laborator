public class FactoryProducer {

    public static AbstractMonitor createMonitor(boolean rounded) {
        if(rounded){
            return new RoundedScreenMonitorFactory();
        }
        else{
            return new WideScreenMonitorFactory();
        }
    }
}
