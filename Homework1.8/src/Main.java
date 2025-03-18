

public class Main{

    public static void main(String[] args) {

        Address address1 = new Address("Constanta","Delfinului","Romania");
        Address address2 = new Address("Craiova","Mircea","Romania");
        Address address3 = new Address("Ovidiu","Zambilei","Romania");
        Address address4 = new Address("Suceava","Stefan cel Mare","Romania");

        Tourist tourist1 = new Tourist(23211,"Silviu",20,address3);
        Tourist tourist2 = new Tourist(5000,"Robert",20,address1);
        Tourist tourist3 = new Tourist(56000,"Stefan",20,address2);

        Hotel hotel1 = new Hotel("Iaki",address4);

        hotel1.addTouristToHotel(tourist1);
        hotel1.addTouristToHotel(tourist2);
        hotel1.addTouristToHotel(tourist3);

        Hotel hotel2 = new Hotel("Linganguligulilinganguli", address2);

        hotel1.moveTouristToHotel(hotel2,tourist1);

        hotel1.displayAllTourists();
        hotel2.displayAllTourists();

    }
}