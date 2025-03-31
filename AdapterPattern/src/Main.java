public class Main {
    public static void main(String[] args) {
        HDMI hdmi = new HDMI();
        hdmi.connectHDMI();

        HDMItoVGA hdmiVga = new HDMItoVGA();
        hdmiVga.connect();
    }
}
