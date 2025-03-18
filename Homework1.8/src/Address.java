public class Address {
    private String city;
    private String country;
    private String street;

    Address(){}

    public Address(String city,String street,String country){
        this.city=city;
        this.street=street;
        this.country=country;
    }

    @Override
    public String toString()
    {
        return "City - " +city +", Country - "+country+", Street - "+street;
    }
}
