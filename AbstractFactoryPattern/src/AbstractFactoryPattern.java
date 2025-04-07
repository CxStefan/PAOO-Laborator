public class AbstractFactoryPattern {

    public static void main(String[] args) {

        AbstractMonitor roundedmonitors = FactoryProducer.createMonitor(true);

        Monitor monitor1 = roundedmonitors.getMonitor("Rounded Monitor");
        monitor1.start();

        Monitor monitor2 = roundedmonitors.getMonitor("Rounded Wide Monitor");
        monitor2.start();

        AbstractMonitor widemonitors = FactoryProducer.createMonitor(false);

        Monitor monitor3 = widemonitors.getMonitor("Wide Monitor");
        monitor3.start();
    }
}
