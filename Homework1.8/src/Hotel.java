import java.util.ArrayList;
import java.util.List;


public class Hotel {

    public ArrayList<Tourist> tourists;
    private String name;
    private Address address;

    public Hotel(){
        this.name="";
        this.address=new Address();
        this.tourists = new ArrayList<Tourist>();
    }

    public Hotel(String name,Address address){
        this.name=name;
        this.address=address;
        this.tourists = new ArrayList<Tourist>();
    }

    public void addTouristToHotel(Tourist tourist){
        tourists.add(tourist);
    }

    public void removeTourist(Tourist tourist){
        if(tourists.contains(tourist))
        {
            tourists.remove(tourist);
        }
        else System.out.println("Tourist not found");
    }

    public void moveTouristToHotel(Hotel hotel , Tourist tourist)
    {
        removeTourist(tourist);
        hotel.addTouristToHotel(tourist);
    }

    public void displayAllTourists(){
        for(Tourist t : tourists){
            System.out.println(t);
        }
    }
}

