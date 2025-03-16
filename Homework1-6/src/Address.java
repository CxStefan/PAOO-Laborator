
public class Address {
    String street;
    String city;
    String country;

    public Address(String street, String city, String country) {
        this.street = street;
        this.city = city;
        this.country = country;
    }

    public String getStreet() {return street;}
    public String getCity() {return city;}
    public String getCountry() {return country;}
}
