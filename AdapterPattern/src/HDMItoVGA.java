public class HDMItoVGA implements VGA{

    private HDMI hdmiCable;

    public HDMItoVGA(){
        this.hdmiCable = new HDMI();
    }

    public void connect(){
        hdmiCable.connectHDMI();
    }
}
