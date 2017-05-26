package tibi.sci.rental.domain;

/**
 * Created by Tibi on 5/26/2017.
 */
public class Address {

    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
        /**
         22
         Formats the address.
         23
         @return a string containing the address in mailing list format
         24
         */

    public String format()
    {
        return street + "\n" + city + "," + state + "," +"zip:"+ zip;
    }
    private String street;
    private String city;
    private String state;
    private String zip;
}

