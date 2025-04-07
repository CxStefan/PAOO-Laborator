public class RoundedScreenMonitorFactory extends AbstractMonitor{

    @Override
    public Monitor getMonitor(String type){
        if(type.equals("Rounded Monitor")){
            return new RoundedScreenMonitor();
        }
        if(type.equals("Rounded Wide Monitor")){
            return new RoundedWideScreenMonitor();
        }
        return null;
    }
}
