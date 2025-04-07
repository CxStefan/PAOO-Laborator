public class WideScreenMonitorFactory extends AbstractMonitor{

    @Override
    public Monitor getMonitor(String type){
        if(type.equals("Wide Monitor")){
            return new WideScreenMonitor();
        }
        return null;
    }
}
